package main;

import java.util.ArrayList;
import java.util.List;

public class MyBigNumber {
    private List<String> steps = new ArrayList<>();
    private int previousCarry = 0;

    public String sum(String stn1, String stn2) {
        steps.clear();
        previousCarry = 0;

        System.out.println("Bắt đầu: " + stn1 + " + " + stn2);
        steps.add("Bắt đầu: " + stn1 + " + " + stn2);

        StringBuilder result = new StringBuilder();
        int carry = 0;
        int i = stn1.length() - 1;
        int j = stn2.length() - 1;
        int step = 1;

        while (i >= 0 || j >= 0 || carry > 0) {
            int d1 = (i >= 0) ? stn1.charAt(i) - '0' : 0;
            int d2 = (j >= 0) ? stn2.charAt(j) - '0' : 0;

            int sum = d1 + d2 + carry;
            int currentDigit = sum % 10;
            carry = sum / 10;

            String stepLog;
            if (step == 1) {
                stepLog = "Bước " + step + ": " + d1 + " + " + d2 + " = " + sum +
                        ", ghi " + currentDigit + " nhớ " + carry;
            } else {
                stepLog = "Bước " + step + ": " + d1 + " + " + d2 + " = " + (d1+d2) +
                        " + nhớ " + previousCarry + " = " + sum +
                        ", ghi " + currentDigit + " nhớ " + carry;
            }

            System.out.println(stepLog);
            steps.add(stepLog);

            result.insert(0, currentDigit);
            previousCarry = carry;

            i--;
            j--;
            step++;
        }

        while (result.length() > 1 && result.charAt(0) == '0') {
            result.deleteCharAt(0);
        }

        String finalResult = result.toString();
        System.out.println("Kết quả: " + finalResult);
        steps.add("Kết quả: " + finalResult);

        return finalResult;
    }

    public List<String> getSteps() {
        return new ArrayList<>(steps);
    }

    public void printAllSteps() {
        System.out.println("\n=== CHI TIẾT CÁC BƯỚC ===");
        for (String s : steps) {
            System.out.println(s);
        }
        System.out.println("========================\n");
    }
}
