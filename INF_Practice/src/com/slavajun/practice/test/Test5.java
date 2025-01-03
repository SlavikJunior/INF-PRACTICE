package com.slavajun.practice.test;

import java.util.*;


public class Test5 {

    public static void main(String[] args) {
//        task1();
//        task2();
//        task3();
//        task4();
//        task5();
//        task6();
        task8();

    }

    public static void task8() {
        int[][] matrix = genQuadraticRandomMatrix();
        System.out.println("Исходная матрица:");
        printMatrix(matrix);

        int[][] set = getSetOfDiagonalElements(matrix);
        System.out.println(Arrays.toString(set[0]));
        System.out.println(Arrays.toString(set[1]));
    }

    public static void task6() {
        int[][] matrix = genQuadraticRandomMatrix();
        System.out.println("Исходная матрица:");
        printMatrix(matrix);

//        System.out.println("Массив первых чётных элементов:");
//        int[] values1 = getFirstEvenElements(matrix);
//        System.out.println(Arrays.toString(values1));

        System.out.println("Массив последних нечётных элементов:");
        int[] values2 = getLastNotEvenElements(matrix);
        System.out.println(Arrays.toString(values2));
    }

    public static void task5() {
        int[][] matrix = genQuadraticRandomMatrix();

//        int[][] newMatrix1 = changeRowWithSupArray(matrix);
//        System.out.println("Исходная матрица: ");
//        printMatrix(matrix);
//        System.out.println("Полученная матрица: ");
//        printMatrix(newMatrix1);

//        int[][] newMatrix2 = changeRowWithoutSupArray(matrix);
//        System.out.println("Исходная матрица: ");
//        printMatrix(matrix);
//        System.out.println("Полученная матрица: ");
//        printMatrix(newMatrix2);

        int[][] newMatrix3 = changeColumnWithoutSupArray(matrix);
        System.out.println("Исходная матрица: ");
        printMatrix(matrix);
        System.out.println("Полученная матрица: ");
        printMatrix(newMatrix3);
    }

    public static void task4() {
        int[][] matrix1 = genMatrix();
        isContainsZeroColumn(matrix1); // метод ищет нулевые колонки

        int[][] matrix2 = genQuadraticRandomMatrix();
        boolean res2 = isContainsElementBetween0b(matrix2);
        String result2 = "\nВ матрице ";
        result2 += res2 ? "есть колонка, содержащая элементы [0; b]" : "нет колонки, содержащей элементы [0; b]";
        System.out.println(result2);

        int[][] matrix3 = genMatrix();
        boolean res3 = isContainsOnlyEvenElements(matrix3);
        String result3 = "В матрице ";
        result3 += res3 ? "есть столбец только из чётных элементов!" : "нет столбца из чётных элементов!";
        System.out.println(result3);
    }

    public static void task3() {
        int[][] matrix = genRandomMatrix();
        printMatrix(matrix);

        int sumRow = sumRow(matrix);
        int sumColumn = sumColumn(matrix);
        System.out.println("Сумма выбранной строки: " + sumRow);
        System.out.println("Сумма выбранного столбца: " + sumColumn);

        String result = "\n";
        if (sumRow > sumColumn) {
            result += "Сумма выбранной строки больше суммы выбранного столбца!";
        } else if (sumRow < sumColumn) {
            result += "Сумма выбранной строки меньше суммы выбранного столбца!";
        } else {
            result += "Сумма выбранной строки равна сумме выбранного столбца!";
        }
        System.out.println(result);
    }

    public static void task2() {
        int[][] matrix = genQuadraticRandomMatrix();
        printMatrix(matrix);

        boolean a = isValidRowMatrixTask2(matrix);
        String messageA = "Сумма элементов четвёртой строки ";
        messageA += a? "двузначное число\n" : "не двузначное число\n";
        System.out.println(messageA);

        boolean b = isValidColumnMatrixTask2(matrix);
        String messageB = "Произведение элементов заднного столбца ";
        messageB += b? "не превышает заданного числа\n" : "превышает заданное число\n";
        System.out.println(messageB);
    }

    public static void task1() {
        int[][] matrix = genQuadraticRandomMatrix();
        printMatrix(matrix);

        boolean a = (isValidColumnMatrixTask1(matrix));
        String messageA = "Произведение элементов второго столбца ";
        messageA += a? "трёхзначное число\n" : "не трёхзначное число\n";
        System.out.println(messageA);

        boolean b = isValidRowMatrixTask1(matrix);
        String messageB = "Сумма элементов выбранной строки ";
        messageB += b? "превышает заданное число\n" : "не превышает заданное число\n";
        System.out.println(messageB);
    }

    public static void transpMatrix() {
        int[][] matrix = genRandomMatrix();
        for (int[] temp : matrix) {
            System.out.println(Arrays.toString(temp));
        }
        System.out.println("========================");

        int[][] transpMatrix = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix[0].length; i++) {
            int[] row = matrix[i];
            for (int j = 0; j < row.length; j++) {
                transpMatrix[i][j] = matrix[j][i];
            }
            Arrays.sort(transpMatrix[i]);
            System.out.println(Arrays.toString(transpMatrix[i]));
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int[] row = matrix[i];
            for (int j = 0; j < row.length; j++) {
                System.out.print(row[j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] genRandomMatrix() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите количество строк!");
        int m = scanner.nextInt();
        System.out.println("Введите количество столбцов!");
        int n = scanner.nextInt();
        System.out.println("Введите минимальное значение элемента матрицы!");
        int minVal = scanner.nextInt();
        System.out.println("Введите максимальное значение элемента матрицы!");
        int maxVal = scanner.nextInt();
        int[][] matrix = new int[m][n];
        for (int i = 0; i < matrix.length; i++) {
            int[] row = matrix[i];
            for (int j = 0; j < row.length; j++) {
                row[j] = random.nextInt(minVal, maxVal + 1);
            }
        }
        return matrix;
    }

    public static int[][] genMatrix() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество строк!");
        int m = scanner.nextInt();
        System.out.println("Введите количество столбцов!");
        int n = scanner.nextInt();
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            int[] row = matrix[i];
            for (int j = 0; j < n; j++) {
                System.out.print(String.format("Вводите %d-й элемент %d-й строки!", (j + 1), (i + 1)) + " ");
                row[j] = scanner.nextInt();
            }
            System.out.println(Arrays.toString(row));
        }
        return matrix;
    }

    public static int[][] genQuadraticRandomMatrixWithMaxAndMin() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите размер квадратной матрицы!");
        int size = scanner.nextInt();
        System.out.println("Введите максимальное значение элемента матрицы!");
        int maxVal = scanner.nextInt();
        System.out.println("Введите минимальное значение элемента матрицы!");
        int minVal = scanner.nextInt();
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            int[] row = matrix[i];
            for (int j = 0; j < size; j++) {
                row[j] = random.nextInt(minVal, (maxVal + 1));
            }
        }
        return matrix;
    }

    public static int[][] genQuadraticRandomMatrix() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите размер квадратной матрицы!");
        int size = scanner.nextInt();
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            int[] row = matrix[i];
            for (int j = 0; j < size; j++) {
                row[j] = random.nextInt(0, 101);
            }
        }
        return matrix;
    }

    public static int[][] getSetOfDiagonalElements(int[][] matrix) {
        int[][] set = new int[matrix.length][];
        int[] elementsAboveMainDiagonal = new int[100];
        int[] elementsBelowThenMainDiagonal = new int[100];
        int[] elementsAboveSideDiagonal = new int[100];
        int[] elementsBelowThenSideDiagonal = new int[100];
        set[0] = elementsAboveMainDiagonal;
        set[1] = elementsBelowThenMainDiagonal;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                int element = matrix[i][j];
                if (j > i) {
                    elementsAboveMainDiagonal[i] = element;
                }
                else if (j < i) {
                    elementsBelowThenMainDiagonal[i] = element;
                }
                else if (j < i) {
                    elementsBelowThenMainDiagonal[i] = element;
                }
            }
        }

        return set;
    }

    public static int[] getFirstEvenElements(int[][] matrix) {
        int len = matrix.length;
        int[] values = new int[len];

        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < len; j++) {
                if (matrix[j][i] % 2 == 0) {
                    values[i] = matrix[j][i];
                    break;
                }
            }
        }

        return values;
    }

    public static int[] getLastNotEvenElements(int[][] matrix) {
        int len = matrix.length;
        int[] values = new int[len];

        for (int i = 0; i < len; i++) {
            int[] row = matrix[i];
            for (int j = 0; j < row.length; j++) {
                int curEl = matrix[i][j];
                if(curEl % 2 == 1) {
                    values[i] = curEl;
                }
            }
        }

        return values;
    }

    public static int[][] changeColumnWithoutSupArray(int[][] matrix) {
        Scanner scanner = new Scanner(System.in);

        int len = matrix.length;
        int[][] newMatrix = new int[len][len];
        System.out.println("Введите через Enter два индекса строк, которые хотите поменять местами!");
        int firstColumnId = scanner.nextInt();
        int secondColumnId = scanner.nextInt();

        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (j == firstColumnId) {
                    int temp = matrix[i][j];
                    newMatrix[i][j] = matrix[i][secondColumnId];
                    newMatrix[i][secondColumnId] = temp;
                } else if (j != secondColumnId) {
                    newMatrix[i][j] = matrix[i][j];
                }
            }
        }

        return newMatrix;
    }

    public static int[][] changeRowWithoutSupArray(int[][] matrix) {
        Scanner scanner = new Scanner(System.in);

        int len = matrix.length;
        int[][] newMatrix = new int[len][len];
        System.out.println("Введите через Enter два индекса строк, которые хотите поменять местами!");
        int firstRowId = scanner.nextInt();
        int secondRowId = scanner.nextInt();

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (i == firstRowId) {
                    int temp = matrix[i][j];
                    newMatrix[i][j] = matrix[secondRowId][j];
                    newMatrix[secondRowId][j] = temp;
                }
                else if (i != secondRowId) {
                    newMatrix[i][j] = matrix[i][j];
                }
            }
        }
        return newMatrix;
    }

    public static int[][] changeRowWithSupArray(int[][] matrix) {
        Scanner scanner = new Scanner(System.in);
        int len = matrix.length;
        int[][] newMatrix = new int[len][len];
        System.out.println("Введите через Enter два индекса строк, которые хотите поменять местами!");
        int firstRowId = scanner.nextInt();
        int secondRowId = scanner.nextInt();
        int[] tempArray = new int[len];
        for (int i = 0; i < len; i++) {
            tempArray[i] = matrix[firstRowId][i];
        }
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (i == secondRowId) {
                    newMatrix[secondRowId][j] = tempArray[j];
                }
                else if (i == firstRowId) {
                    newMatrix[firstRowId][j] = matrix[secondRowId][j];
                }
                else {
                    newMatrix[i][j] = matrix[i][j];
                }
            }

        }
        return newMatrix;
    }

    public static boolean isContainsOnlyEvenElements(int[][] matrix) {
        System.out.println("Сейчас будем искать только чётные столбцы!");
        boolean flag = false;
        for (int j = 0; j < matrix[0].length; j++) {
            int cnt = 0;
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][j] % 2 == 0) {
                    cnt ++;
                }
            }
            if (cnt == matrix.length) {
                flag = true;
            }
        }
        return flag;
    }

    public static boolean isContainsElementBetween0b(int[][] matrix) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите границу отрезка!");
        int b = scanner.nextInt();
        int[] validValues = new int[b + 1];
        for (int i = 0; i < validValues.length; i++) {
            validValues[i] = i;
        }
        System.out.println("Сейчас будем искать столбцы, содержащие элементы из [0; b]!");
        for (int j = 0; j < matrix[0].length; j++) {
            int cnt = 0;
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][j] >= 0 && matrix[i][j] <= b) {
                    cnt++;
                }
            }
            if (cnt == matrix.length) {
                return true;
            }
        }
        return false;
    }

    public static int binarySearch(int[] values, int value) {
        int low = 0;
        int high = values.length - 1;
        while(low <= high) {
            int mid = (high + low) / 2;
            int temp = values[mid];

            if (value > temp) {
                low = mid + 1;
            } else if (value < temp) {
                high = mid - 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }

    public static void isContainsZeroColumn(int[][] matrix) {
        System.out.println("Сейчас будем искать нулевые столбцы!");
        boolean flag = false;
        for (int j = 0; j < matrix[0].length; j++) {
            int cnt = 0;
            for (int i = 0; i < matrix.length; i++) {
                if (j < matrix[i].length) { // Проверяем, есть ли элемент в текущей строке
//                    System.out.print(matrix[i][j] + " ");
                    if (matrix[i][j] == 0) {
                        cnt += 1;
                    }
                }
            }
            if (cnt == matrix.length) {
                System.out.println(String.format("Из нулей состоит %d-й столбец!", (j + 1)));
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("Нулевых столбцов не нашлось:/");
        }
    }

    public static boolean isValidRowMatrixTask1(int[][] matrix) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер строки, которую хотите проверить\n(индексация с нуля!)");
        int m = scanner.nextInt();
        System.out.println("Введите заданное число!");
        int magicSuperNumber = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[m][i];
        }
        return sum > magicSuperNumber;
    }

    public static boolean isValidRowMatrixTask2(int[][] matrix) {
        int sum = 0;
        int m = 3;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[m][i];
        }
        String number = Integer.toString(sum);
        return number.length() == 2;
    }

    public static boolean isValidColumnMatrixTask1(int[][] matrix) {
        int mult = 1;
        int column = 1;
        for (int i = 0; i < matrix.length; i++) {
            mult *= matrix[i][column];
        }
        String n = Integer.toString(mult);
        return n.length() == 3;
    }

    public static boolean isValidColumnMatrixTask2(int[][] matrix) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер столбца, который хотите проверить\n(индексация с нуля!)");
        int n = scanner.nextInt();
        System.out.println("Введите заданное число!");
        int magicSuperNumber = scanner.nextInt();
        int mult = 1;
        for (int i = 0; i < matrix.length; i++) {
            mult *= matrix[i][n];
        }
        return mult <= magicSuperNumber;
    }

    public static int sumRow(int[][] matrix) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер строки, которую хотите просуммировать!\n(индексация с нуля!)");
        int m = scanner.nextInt();
        int sum = 0;
        int[] row = matrix[m];
        for (int i = 0; i < row.length; i++) {
            sum += row[i];
        }
        return sum;
    }

    public static int sumColumn(int[][] matrix) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер столбца, который хотите просуммировать!\n(индексация с нуля!)");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            int element = matrix[i][n];
            sum += element;
        }
        return sum;
    }
}
