class Solution {
    static int dataTypeSize(String str) {
        // code here
        switch (str) {
            case "Character":
                return 1; 
            case "Integer":
                return Integer.BYTES;
            case "Long":
                return Long.BYTES; 
            case "Float":
                return Float.BYTES; 
            case "Double":
                return Double.BYTES;
    }
    return -1;
}}