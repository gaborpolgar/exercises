package codewars.youorderplease;

public class Order {

    public static void main(String[] args) {
        System.out.println(order("is2 Thi1s T4est 3a"));
    }

    public static String order(String words) {
        if (words.isEmpty()){
            return words;
        }
        String [] ws = words.split(" ");
        String [] result = new String[ws.length];
        System.out.println(result.length);
        System.out.println(ws.length);

        for (int i = 0; i<ws.length;i++){
            for (int j = 0; j < ws[i].length(); j++) {
             if (Character.isDigit(ws[i].charAt(j))){
                 result[Character.getNumericValue(ws[i].charAt(j))-1] = ws[i];
             }
            }
    }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < result.length; i++) {
            sb.append(result[i] + " ");
        }
        return sb.toString().trim();
}
}
