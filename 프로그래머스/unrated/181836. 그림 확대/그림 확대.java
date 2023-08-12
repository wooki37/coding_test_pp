class Solution {
    public String[] solution(String[] picture, int k) {
        int rows = picture.length;
        int cols = picture[0].length();
        
        String[] result = new String[rows * k];
        
        for (int i = 0; i < rows; i++) {
            StringBuilder row = new StringBuilder();
            for (char pixel : picture[i].toCharArray()) {
                for (int j = 0; j < k; j++) {
                    row.append(pixel);
                }
            }
            for (int j = 0; j < k; j++) {
                result[i * k + j] = row.toString();
            }
        }
        return result;
    }
}