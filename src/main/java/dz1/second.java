package dz1;

public class second {    public int removeElement(int[] nums, int val) {
    int coppy = 0;
    for(int i = 0; i < nums.length ; i++){
        if (nums[i] != val){
            nums[coppy++] = nums[i]; }}

    return coppy;
}
}
