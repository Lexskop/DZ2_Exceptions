// # Если необходимо, исправьте данный код (задание 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
// # Задание 2:
// try {
//         int d = 0;
//         double catchedRes1 = intArray[8] / d;
//         System.out.println("catchedRes1 = " + catchedRes1);
//     }   catch (ArithmeticException e) 
// {
//    System.out.println("Catching exception: " + e);
// }

public class task2 {
   
    public static void main(String[] args) {
        try {
            int d = 3;
            int[] intArray;
            intArray = new int[10];
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
         } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
         }         
    }
}

/// В плане решения я прикинул, что у джава вроде должно быть начало(шапка). Также должны быть объявлены переменные. 
/// И вот когда все это сделано, то запуск кода при неизменных значениях переменных должен делить на 0 и выводить эту ошибку на экран.
/// Если изменить d, то он просто посчитает, без ошибки.
/// По итогу выводит на экран: Catching exception: java.lang.ArithmeticException: / by zero