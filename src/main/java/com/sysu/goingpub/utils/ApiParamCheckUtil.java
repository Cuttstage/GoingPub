package com.sysu.goingpub.utils;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

public class ApiParamCheckUtil {

	private static Validator validator = null;

	public static <T> String checkParam(T obj,boolean isAllFault) {
		if (validator == null) {
			ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
			validator = validatorFactory.getValidator();
		}
		Set valideSert = validator.validate(obj, new Class[0]);
		if ((valideSert != null) && (valideSert.size() > 0)) {
			StringBuilder strBuff = new StringBuilder();
			for (ConstraintViolation cv : validator.validate(obj, new Class[0])) {
				strBuff.append(cv.getPropertyPath()).append(":").append(cv.getMessage()).append(";");
				if(isAllFault){
					break;
				}
			}
			return strBuff.toString();
		}
		return null;
	}

	public static <T> String checkParam(T obj) {
		if (validator == null) {
			ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
			validator = validatorFactory.getValidator();
		}
		String errorMsg=null;
		Set<ConstraintViolation<T>> valideSert = validator.validate(obj, new Class[0]);
		if ((valideSert != null) && (valideSert.size() > 0)) {
			for (ConstraintViolation cv : valideSert) {
				errorMsg=cv.getMessage();
				break;
			}
		}
		return errorMsg;
	}


	@SuppressWarnings("rawtypes")
	public static <T> String checkParam(T obj, String[] args) {
		StringBuilder strBuff = new StringBuilder("");
		ValidatorFactory validatorFactory;
		if (validator == null) {
			validatorFactory = Validation.buildDefaultValidatorFactory();
			validator = validatorFactory.getValidator();
		}
		if (args != null) {
			for (String param : args) {
				Set valideSert = validator.validateProperty(obj, param, new Class[0]);
				if ((valideSert != null) && (valideSert.size() > 0)) {
					for (ConstraintViolation cv : validator.validateProperty(obj, param, new Class[0])) {
						strBuff.append(cv.getPropertyPath()).append(":").append(cv.getMessage()).append(";");
					}
				}
			}
		}
		return ((strBuff.toString().equals("")) ? null : strBuff.toString());
	}
}