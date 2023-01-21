import ru.netology.sqr.SQRService;

public class Main {

    public static void main(String[] args) {

        SQRService service = new SQRService(); // Сервис расчета количества чисел, квадрат которых входит в указанный диапазон
        int boundMin = 200;  //установить нижнюю границу диапазона
        int boundMax = 300;  //установить верхнюю границу диапазона
        int count = service.calculate(boundMin, boundMax);
        System.out.println("Количество чисел квадраты которых входят в выбраный числовой диапазон от " + boundMin + " до " + boundMax + " составляет: " + count);




    }



}
