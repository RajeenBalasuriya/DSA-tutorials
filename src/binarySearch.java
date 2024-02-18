public class binarySearch {

    private final int findMe ;//this will be set to a value when creating obejct
    private final int values [];
    public binarySearch(int findMe,int values[]){
        this.findMe=findMe;
        this.values=values;
    }


    //implementation of search method using Binary search

    public int binarySearchIt(){

        int first=0;
        int last=values.length-1;

        while(first<=last){
            int middle=(first+last)/2;//check for middle item

            if (values[middle]==findMe){
                return middle;
            } else if (values[middle]<findMe) {
                first=middle+1;//repeat with right half

            } else if (values[middle]>findMe) {
                last=middle-1;

            }

        }

        return -1;//indicates failure

    }



}
