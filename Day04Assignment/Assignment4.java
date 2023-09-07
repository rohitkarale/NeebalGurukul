package neebalsgurukul.day04;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ev = {850, 945, 1145, 1155, 1230, 1245, 1330, 1340, 1425, 1445};
        int totaltime = 0;
        
        for (int i = 0; i < ev.length - 1; i += 2) {
            int time1 = ev[i];
            int time2 = ev[i + 1];
            int minutes1 = (time1 / 100) * 60 + (time1 % 100);
            int minutes2 = (time2 / 100) * 60 + (time2 % 100);
            totaltime += minutes2 - minutes1;
        }
        
        int h = totaltime / 60;
        int m = totaltime % 60;

        System.out.println("Running time: " + h + " hr " + m + " min");
	}

}
