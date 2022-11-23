package HW_20_11_2022;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class PalindromeIterator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
//        String s = "word";

        LinkedList<Character> list = new LinkedList<>();

        for (int i = 0; i < s.length(); i++) {
            list.add(s.charAt(i));
        }
        System.out.println(list);

        ListIterator<Character> iterator = list.listIterator();
        ListIterator<Character> reverse = list.listIterator(list.size());

        boolean isPalindrome = true;
        int index = list.size() / 2;

        while (iterator.hasNext() && reverse.hasPrevious()) {
            if (iterator.next() != reverse.previous() && iterator.nextIndex() < index) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println(isPalindrome);
    }
}