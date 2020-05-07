/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package src;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import org.junit.Before;

public class Tests01 {
    ListaDuplamenteEncadeada lista;
    int first, last, last_index, random, random_index;
    int sorted_pos, negative_value, negative_index;
    int before_half, after_half;
    ArrayList<Integer> numbers;

    @Before
    public void setUp() {
        numbers = new ArrayList<Integer>();
        for (int i = 0; i < 100; i++) {
            numbers.add(i + 1);
        }
        last_index = numbers.size() - 1;
        random_index = new Random().nextInt(numbers.size());
        sorted_pos = new Random().nextInt(numbers.size());
        negative_index = sorted_pos - numbers.size();
        Collections.shuffle(numbers);
        lista = new ListaDuplamenteEncadeada();
        for (int i = 0; i < numbers.size(); i++) {
            lista.adicionar((int) numbers.get(i));
            if (i == 0) {
                first = (int) numbers.get(i);
            }
            if (i == (numbers.size() - 1)) {
                last = (int) numbers.get(i);
            }
            if (i == random_index) {
                random = (int) numbers.get(i);
            }
            if (i == sorted_pos) {
                negative_value = (int) numbers.get(i);
            }
            if (i == 33) {
                before_half = (int) numbers.get(i);
            }
            if (i == 71) {
                after_half = (int) numbers.get(i);

            }
        }
    }

    @Test
    public void testarBuscaElementoComIndiceNegativo() {
        int value = lista.get(negative_index);
        assertEquals(value, negative_value);
    }

}