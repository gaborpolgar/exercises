//package hackerrank;
//
//import java.time.LocalDate;
//import java.time.LocalDateTime;
//import java.util.Calendar;
//
//public class DateAndTimeProblem {
//
//    public static void main(String[] args) {
//        int year = 1990;
//        int month = 12;
//        int day = 05;
//
//        Calendar cal = new Calendar.Builder().setDate(year, month, day).build();
//        LocalDate dt = LocalDate.of(year, month, day);
//        Calendar c = Calendar.getInstance();
//        c.set(year, month-1, day);
//        cal.set(year, month, day);
//        Calendar cal = new Calendar();
//        {
//            @Override
//            protected void computeTime() {
//
//            }
//
//            @Override
//            protected void computeFields() {
//
//            }
//
//            @Override
//            public void add(int field, int amount) {
//
//            }
//
//            @Override
//            public void roll(int field, boolean up) {
//
//            }
//
//            @Override
//            public int getMinimum(int field) {
//                return 0;
//            }
//
//            @Override
//            public int getMaximum(int field) {
//                return 0;
//            }
//
//            @Override
//            public int getGreatestMinimum(int field) {
//                return 0;
//            }
//
//            @Override
//            public int getLeastMaximum(int field) {
//                return 0;
//            }
//        }
//        dt.getDayOfWeek();
//        return ""+dt.getDayOfWeek();
//        Calendar recent = cal.build();
//        LocalDate date = LocalDate.of(recent);
//        day_of_week = {"SUNDAY", "MONDAY", TUESDAY}
//        return day_of_week[recent.get(Calendar.DAY_OF_WEEK-1)];
//        System.out.println(recent.toString());
//        System.out.println(recent.getFirstDayOfWeek());
//        System.out.println(recent.get(Calendar.DAY_OF_WEEK));
//         if (Calendar.SUNDAY == recent.DAY_OF_WEEK){
//             System.out.println(Calendar.SUNDAY);
//         }
//         switch (Calendar.DAY_OF_WEEK){
//             case 1:
//                 Calendar.SUNDAY;
//                 break;
//
//         }
//
//
//
//    }
//}
