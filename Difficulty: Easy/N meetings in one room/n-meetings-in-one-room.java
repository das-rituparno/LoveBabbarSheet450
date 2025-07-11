class Solution {
    // Function to find the maximum number of meetings that can
    // be performed in a meeting room.
    public int maxMeetings(int start[], int end[]) {
        // add your code here
         List<Meeting> meetings = new ArrayList<>();
        for (int i=0; i<start.length; i++) {
            meetings.add(new Meeting(start[i], end[i]));
        }
        meetings.sort(Comparator.comparingInt(m -> m.end));
        // System.out.println("Meetings after sorting by end time:");
        // for (Meeting m : meetings) {
        //     System.out.println("(" + m.start + ", " + m.end + ")");
        // }

        int count = 0;
        int lastEndTime = -1;

        for (Meeting item : meetings) {
            if (item.start > lastEndTime) {
                count++;
                lastEndTime = item.end;
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
