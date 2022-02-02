package gay10.Streams;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorsEx02 {
  private static IntSummaryStatistics statistics;

public static void main(String[] args) {
	List<Product> list=List.of(
			new Product(10,"laptop",2000.0),
			new Product(20,"laptop",2000.0),
			new Product(23,"laptop",2000.0),
			new Product(40,"laptop",2000.0),
			new Product(50,"laptop",2000.0)
			);

    Map<String,Integer> sumOfproduct=list.stream().collect(Collectors.groupingBy
    		(Product :: getpName, Collectors.summingInt(Product::getpQty)));
    
    System.out.println(sumOfproduct);
    
    Map<Integer,List<Product>> groupByQty=list.stream().collect(Collectors.groupingBy(Product::getpQty));
    
    System.out.println(groupByQty);
    
    System.out.println("--------");
    System.out.println(groupByQty.get(10));
    
    System.out.println("-------------");
    for(Product temp: groupByQty.get(10)) {
    	System.out.println(temp);
    }
    
    Map<Double, Set<String>> collect =list.stream().
    		collect(Collectors.groupingBy(Product::getpPrice,
    				Collectors.mapping(Product ::getpName, Collectors.toSet())));
    
    System.out.println("-----==========--------");
    System.out.println(collect);
    
    
    IntSummaryStatistics statistics=list.stream().mapToInt(x->x.getpQty()).summaryStatistics();
   System.out.println("Average :"+ statistics.getAverage());
   System.out.println("Sum :"+ statistics.getSum());
   System.out.println("Min :"+ statistics.getMin());
  }
}
