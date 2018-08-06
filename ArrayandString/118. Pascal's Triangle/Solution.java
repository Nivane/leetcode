//除了第一行，其余行的首尾都是1
public class Solution {
    public List<List<Integer>> generate(int numRows) {
        ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();
        if (numRows <= 0)
            return res;
        ArrayList<Integer> tri = new ArrayList<Integer>();
        tri.add(1);
        //先把三角的第一行加入结果
        res.add(tri);
        for (int i = 1; i < numRows; i++) {
            tri = new ArrayList<Integer>();
            tri.add(1);
            for (int j = 1; j < i; j++) {//边界从0，不计算最后一个元素，最后一个元素直接赋值
                //获取上一行的List
                List<Integer> upTri = res.get(i - 1);
                //根据上一行的List计算
                tri.add(upTri.get(j - 1) + upTri.get(j));
            }
            tri.add(1);//最后一个元素是1
            res.add(tri);
        }
        return res;
    }
}