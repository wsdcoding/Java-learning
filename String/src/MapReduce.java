import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;

/**
 * @Description: MapReduce数据基础分析模型分为两个部分
 * 一、Map处理部分
 * 二、Reduce分析部分
 * 注意：如果要使用Stream进行分析处理，则一定要将全部的数据保存在集合之中
 * @Authror wsdcoding
 */

public class MapReduce {
    public static void main(String[] args) {
        ArrayList<Order> orders = new ArrayList<>();
        orders.add(new Order("Applea",5000, 1));
        orders.add(new Order("XiaoMi",3000, 2));
        orders.add(new Order("HuaWei",10000, 3));
        orders.add(new Order("aOnePlus",4000, 4));
        orders.add(new Order("VaVo",5000, 5));
        //分析购买商品之中带有a的信息数据,并金进行商品单价和数量的处理，最后进行汇总
        DoubleSummaryStatistics s = orders.stream()
                .filter((ele) -> ele.getName().contains("a"))
                .mapToDouble((orderObject) -> orderObject.getPrice() * orderObject.getAmount())
                .summaryStatistics();
        System.out.println("购买数量" + s.getCount());
        System.out.println("购买总价" + s.getSum());
        System.out.println("购买平均价" + s.getAverage());
        System.out.println("购买最高价" + s.getMax());
        System.out.println("购买最低价" + s.getMin());
    }
}
