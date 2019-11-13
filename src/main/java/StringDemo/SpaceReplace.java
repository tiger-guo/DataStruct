package StringDemo;

/*
 * @author: LiuGuohu
 * @company: XGLAB
 * @description: 空格替换
 * @date: 2019/11/10
 */
public class SpaceReplace {

    public String replaceSpace(String str) {
        StringBuffer out=new StringBuffer();
        for (int i = 0; i < str.toString().length(); i++) {
            char b=str.charAt(i);
            if(b == ' '){
                out.append("%20");
            }else{
                out.append(b);
            }
        }
        return out.toString();
    }
}
