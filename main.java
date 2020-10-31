public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		System.out.println(countingHighest(Arrays.asList(4,4,4,3,3,3,2,2,8,8,8,8)));
	}
  
	public static int countingHighest(List<Integer> array) {
		int count = 1;
		long max = Long.MIN_VALUE;
		HashSet<Integer> seen = new HashSet<>();
		
		for(int i = 0; i < candles.size(); i++) {
			int item = candles.get(i);
			
			if(item > max) {
				max = item;
				count = 1;
			}

			if(seen.contains(item) && item == max) {
				count++;
			}else if(!seen.contains(item)) {
				seen.add(item);
			}
		}
		
		return count;
	}
}
