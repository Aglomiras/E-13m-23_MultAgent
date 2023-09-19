package org.mpei.HomeWork_4;

import java.util.regex.Pattern;

public class StringDataValidator {
    boolean validate (String first, String second) throws EmptyDataException, UnknownCharacterException {

        if ((first == null || first == "") || (second == null || second == "")) {
            throw new EmptyDataException();
        }
        if (!Pattern.matches("[a-zA-Z0-9\s]+", first) || !Pattern.matches("[a-zA-Z0-9\s]+", second)) {
            throw new UnknownCharacterException();
        }
        return first.equals(second);
    }
}
