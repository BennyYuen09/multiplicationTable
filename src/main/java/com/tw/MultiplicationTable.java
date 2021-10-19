package com.tw;

public class MultiplicationTable {
    public String create(int start, int end) {
        if (!isValid(start, end)){
            return null;
        }else{
            return generateTable(start, end);
        }
    }

    public Boolean isValid(int start, int end) {
        return isInRange(start) && isInRange(end) && isStartNotBiggerThanEnd(start, end);
    }

    public Boolean isInRange(int number) {
        return number <= 1000 && number >= 1;
    }

    public Boolean isStartNotBiggerThanEnd(int start, int end) {
        return start <= end;
    }

    public String generateTable(int start, int end) {
        StringBuilder table = new StringBuilder();
        for (int i=start; i<=end; i++){
            table.append(generateLine(start, i));
            if (i != end){
                table.append("\n");
            }
        }
        return table.toString();
    }

    public String generateLine(int start, int row) {
        StringBuilder line = new StringBuilder();
        for (int i=start; i<=row; i++){
            line.append(generateSingleExpression(i, row));
            if (i != row){
                line.append("  ");
            }
        }
        return line.toString();
    }

    public String generateSingleExpression(int multiplicand, int multiplier) {
        return (multiplicand + "*" + multiplier + "=" + multiplicand * multiplier);
    }
}
