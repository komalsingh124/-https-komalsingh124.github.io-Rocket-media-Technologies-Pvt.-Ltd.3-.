import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Demo {

	public static void main(String[] args) {
		int a[]={10,10,10,10,20,30,30,30,30,30,30,30,40,40,40,40,40};
		HashMap<Integer, Integer> hm=new HashMap<Integer, Integer>();
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			for(int j=0;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}
			}
			hm.put(a[i], (count/2));
		}
		Integer sum = 0;
		Set<Integer> set=hm.keySet();
		Iterator<Integer> itr = set.iterator();
		while(itr.hasNext())
		{
			sum=sum+(Integer)hm.get(itr.next());
		}
		System.out.println(sum);
	}

}
