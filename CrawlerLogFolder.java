public class CrawlerLogFolder {
    public int minOperations(String[] logs) {
        int result = 0;
        for (String str : logs) {
            switch (str) {
                case "../":
                    if (result > 0) {
                        result--;
                    }
                    break;
                case "./":
                    break;
                default:
                    result++;
                    break;
            }
        }
        return result;
    }
}
