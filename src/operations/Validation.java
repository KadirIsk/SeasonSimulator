package operations;

import enumTypes.InputType;
import enumTypes.validation.ValidationStatus;

public class Validation {
    public static ValidationStatus validateUserInputType(String userInput, InputType inputType){
        if(isNull(userInput)) return ValidationStatus.NULL_INPUT;
        if(isEmpty(userInput)) return ValidationStatus.EMPTY_INPUT;

        if(!isNull(inputType)) {
            try {
                switch (inputType) {
                    case INTEGER:
                        Integer.parseInt(userInput);
                        return ValidationStatus.CORRECT;
                    case DOUBLE:
                        Double.parseDouble(userInput);
                        return ValidationStatus.CORRECT;
                    case FLOAT:
                        Float.parseFloat(userInput);
                        return ValidationStatus.CORRECT;
                    case CHAR:
                        if(userInput.length() == 1)
                            return ValidationStatus.CORRECT;
                        return ValidationStatus.INCORRECT_INPUT_TYPE;
                    case STRING:
                        return ValidationStatus.CORRECT;
                }
                return ValidationStatus.UNKNOWN_INPUT_TYPE;
            } catch (Exception e) {
                return ValidationStatus.INCORRECT_INPUT_TYPE;
            }
        }
        else{
            return ValidationStatus.UNKNOWN_INPUT_TYPE;
        }
    }

    public static ValidationStatus validateUserInputLength(double[] userArray, int correctLength){
        if(isNull(userArray)) return ValidationStatus.NULL_INPUT;
        return checkLength(userArray.length, correctLength);
    }

    public static ValidationStatus validateUserInputLength(String[] userArray, int correctLength){
        if(isNull(userArray)) return ValidationStatus.NULL_INPUT;
        return checkLength(userArray.length, correctLength);
    }

    public static ValidationStatus validateUserInputLength(String userInput, int correctLength){
        if(isNull(userInput)) return ValidationStatus.NULL_INPUT;
        if(isEmpty(userInput)) return ValidationStatus.EMPTY_INPUT;
        return checkLength(userInput.length(), correctLength);
    }

    public static ValidationStatus checkLength(int userInputLengt, int correctLength){
        if(userInputLengt == correctLength) return ValidationStatus.CORRECT;
        return ValidationStatus.INCORRECT_INPUT_LENGTH;
    }

    public static ValidationStatus validateUserInputRange(int userInput, int min, int max, boolean isMenu){
        if(isNull(userInput)) return ValidationStatus.NULL_INPUT;
        if(min < userInput && userInput < max) return ValidationStatus.CORRECT;
        if(isMenu) return ValidationStatus.INCORRECT_OPERATION_REQUEST;
        return ValidationStatus.INCORRECT_INPUT_RANGE;
    }

    public static boolean isNull(Object object){
        return object == null;
    }

    public static boolean isEmpty(String input){
        if(input == null || input.length() == 0 || input.trim().equals(""))
            return true;
        return false;
    }
}
