package com.fourcamp.linkbank.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validations {

    public static boolean isCpf(String cpf) {
        Integer multiply = 10;
        Integer totalSum = 0;
        Integer firstDigit;
        Integer lastDigit;

        if (cpf.length() != 11 || cpf == null || cpf.equals("") || cpf.equals("00000000000")
                || cpf.equals("11111111111") || cpf.equals("22222222222") || cpf.equals("33333333333")
                || cpf.equals("44444444444") || cpf.equals("55555555555") || cpf.equals("66666666666")
                || cpf.equals("77777777777") || cpf.equals("88888888888") || cpf.equals("99999999999")) {
            return false;
        }

        for (int i = 0; i < cpf.length() - 2; i++) {
            totalSum += Integer.parseInt(cpf.substring(i, i + 1)) * multiply;
            multiply--;
        }

        firstDigit = 11 - (totalSum % 11);
        multiply = 11;
        totalSum = 0;

        for (int i = 0; i < cpf.length() - 2; i++) {
            totalSum += Integer.parseInt(cpf.substring(i, i + 1)) * multiply;
            multiply--;
        }

        totalSum += firstDigit * 2;
        lastDigit = 11 - (totalSum % 11);

        return (firstDigit == Integer.parseInt(cpf.substring(9, 10))
                && lastDigit == Integer.parseInt(cpf.substring(10)));
    }

    public static boolean isCnpj(String cnpj) {
        if (cnpj.equals("00000000000000") || cnpj.equals("11111111111111") || cnpj.equals("22222222222222")
                || cnpj.equals("33333333333333") || cnpj.equals("44444444444444") || cnpj.equals("55555555555555")
                || cnpj.equals("66666666666666") || cnpj.equals("77777777777777") || cnpj.equals("88888888888888")
                || cnpj.equals("99999999999999") || cnpj.length() != 14 || cnpj == null || cnpj.equals("")) {
            return false;
        }

        Integer invertedCnpj[] = new Integer[cnpj.length() - 2];
        Integer multiply = 2;
        Integer position = 0;
        Integer totalSum = 0;
        Integer firstDigit, lastDigit, digit;

        for (int i = invertedCnpj.length - 1; i > -1; i--) {
            if (multiply > 9) {
                multiply = 2;
            }

            invertedCnpj[position] = Integer.parseInt(cnpj.substring(i, i + 1));
            totalSum += invertedCnpj[position++] * multiply++;
        }

        digit = totalSum % 11;

        if (digit == 0 || digit == 1) {
            firstDigit = 0;
        } else {
            firstDigit = 11 - digit;
        }

        multiply = 2;
        totalSum = firstDigit * multiply++;

        for (int i = 0; i < invertedCnpj.length; i++) {
            if (multiply > 9) {
                multiply = 2;
            }

            totalSum += invertedCnpj[i] * multiply++;
        }
        digit = totalSum % 11;

        if (digit == 0 || digit == 1) {
            lastDigit = 0;
        } else {
            lastDigit = 11 - digit;
        }

        return (firstDigit == Integer.parseInt(cnpj.substring(12, 13))
                && lastDigit == Integer.parseInt(cnpj.substring(13)));
    }

    public static boolean isEmail(String email) {
        if (email.equals("") || email == null) {
            return false;
        }

        String regx = "^[a-zA-Z0-9_!#$%&'\\*+/=?{|}~^.-]+@[a-zA-Z0-9.-]+$";
        Pattern pattern = Pattern.compile(regx);
        Matcher matcher = pattern.matcher(email);

        return matcher.matches();
    }

    public static boolean isCellPhone(String phone) {
        if (phone.equals("") || phone == null) {
            return false;
        }

        String rgx = "^([11-99]{2})([9]{1})([0-9]{8})+$";
        Pattern pattern = Pattern.compile(rgx);
        Matcher matcher = pattern.matcher(phone);

        return matcher.matches();
    }

    public static boolean isRandomKey(String key) {
        if (key.length() != 36 || key == null || key.equals("")) {
            return false;
        }

        String regex = "^([a-zA-Z0-9'\\\\-])+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(key);

        return matcher.matches();
    }
}
