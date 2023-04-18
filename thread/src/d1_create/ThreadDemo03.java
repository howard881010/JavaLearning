package d1_create;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadDemo03 {
    public static void main(String[] args) {
        Callable<String> call = new MyCallable(100);
        // FutureTask 實現 runnable接口，在完畢之後，可以用get取得結果
        FutureTask<String> f1 = new FutureTask<>(call);
        Thread t = new Thread(f1);
        t.start();

        Callable<String> call2 = new MyCallable(50);
        // FutureTask 實現 runnable接口，在完畢之後，可以用get取得結果
        FutureTask<String> f2 = new FutureTask<>(call2);
        Thread t2 = new Thread(f2);
        t2.start();

        try {
            String rs1 = f1.get();
            System.out.println("第一個結果: " + rs1);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        try {
            String rs2 = f2.get();
            System.out.println("第二個結果: " + rs2);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

}
// 1. 定義一個任務類，callable街口，應該申明線程執行完成過後返回的型態
class MyCallable implements Callable<String>{
    private int n;

    public MyCallable(int n) {
        this.n = n;
    }

    @Override
    public String call() throws Exception {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum+=i;
        }
        return "子線程執行的結果是: " + sum;
    }
}