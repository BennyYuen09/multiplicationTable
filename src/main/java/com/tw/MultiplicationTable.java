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
        String table = "";
        for (int i=start; i<=end; i++){
            table += generateLine(start, i);
            if (i != end){
                table += "\n";
            }
        }
        return table;
    }

    public String generateLine(int start, int row) {
        String line = "";
        for (int i=start; i<=row; i++){
            line += generateSingleExpression(i, row);
            if (i != row){
                line += "  ";
            }
        }
        return line;
    }

    public String generateSingleExpression(int multiplicand, int multiplier) {
        return (multiplicand + "*" + multiplier + "=" + multiplicand * multiplier);
    }
}
