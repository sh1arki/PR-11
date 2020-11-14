import java.util.ArrayList;

public class ArrayQueueADT {

    public boolean enqueue (ArrayList<Integer> array, Integer n) //Добавление значения
    {
        return array.add(n);
    }

    public Integer element(ArrayList<Integer> array) //Получение превого значения
    {
        return array.get(0);
    }

    public Integer dequeue (ArrayList<Integer> array)//Удаляет и возвращает значение
    {
        int temp = array.get(0);
        array.remove(0);
        return temp;
    }

    public int size(ArrayList<Integer> array) //Размерность
    {
        return array.size();
    }

    public boolean isEmpty(ArrayList<Integer> array)//Проверка на пустое значение
    {
        return array.isEmpty();
    }

    public void clear(ArrayList<Integer> array)//Очистка
    {
        array.clear();
    }
}
