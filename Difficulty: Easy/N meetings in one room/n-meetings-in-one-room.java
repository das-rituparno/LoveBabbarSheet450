class Solution {
    public int maxMeetings(int start[], int end[]) {
        // add your code here
        List<Meeting> meetings = new ArrayList<>();
        for(int i=0; i<start.length; i++) {
            meetings.add(new Meeting(start[i], end[i]));
        }
        meetings.sort(Comparator.comparingInt(m -> m.end));
        int count = 0;
        int last_end = -1;
        
        for(Meeting item : meetings) {
            if(item.start > last_end) {
                count++;
                last_end = item.end;
            }
        }
        return count;
    }
}

class Meeting {
    int start;
    int end;
    public Meeting(int start, int end) {
        this.start = start;
        this.end = end;
    }
}
