import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Description: Stream :主要功能是进行数据的分析处理，主要针对与集合中的数据进行分析操作。
 * @Authror wsdcoding
 */

/*class StreamDemo {
    List<String> all = new ArrayList<String>();

}*/

public class StreamMainTest {
    public static void main(String[] args) {
        /**
         * 数据统计
         */
        /*StreamDemo  streamDemo = new StreamDemo();
        Collections.addAll(streamDemo.all,"Java","C++","GO");
        Stream<String> stream = streamDemo.all.stream(); //获取Stream 接口对象
       // System.out.println(stream.count()); //输出元素个数
        System.out.println(stream.filter((ele) -> ele.toLowerCase().contains("g")).count());*/

        /**
         * 数据采集操作
         */
        List<String> all = new ArrayList<String>();
        Collections.addAll(all,"Java","C++","GO", "GOOD", "GAY", "GirlF");
        Stream<String> stream = all.stream(); //获取Stream 接口对象
       // 将满足条件的数据收集起来转为List集合
        List<String> result = stream.filter((ele) -> ele.toLowerCase().contains("g")).skip(2).limit(2).collect(Collectors.toList());
        System.out.println(result);

        /**
         * 设置取出的最大的数据量
         */
    }
}
