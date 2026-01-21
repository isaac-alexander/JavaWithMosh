public class ControlFlowOperators {

    public static void main(String[] args) {
        // Comparison Operator
        int x = 1;
        int y = 1;
        System.out.println(x == y); // Equality operator : True
        System.out.println(x != y); // inequality operator: False
        System.out.println(x >= y); // Greater than or equal to: True
        System.out.println(x <= y); // Less than or equal to: True

        // Logical Operator
        int temperature = 22;
        boolean isWarm = temperature > 20 && temperature < 30; // AND operator
        System.out.println(isWarm); // true

        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;
        boolean isEligible = hasHighIncome || hasGoodCredit; // OR operator

        boolean isEligible2 = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord; // NOT Operator

        // Ternary Operator ? :
        // Simplifying If Statements Ternary Operator?
        int income = 120_000;
        String className = income > 100_000 ? "First" : "Economy";

    }
}
