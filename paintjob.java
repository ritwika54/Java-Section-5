public class Main {

    public static void main(String[] args) {
        System.out.println(getBucketCount(3.4, 1.5));
        System.out.println(getBucketCount(6.26, 2.2));
        System.out.println(getBucketCount(3.26, 0.75));

       
    }

 public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0.0 || height <= 0.0 || areaPerBucket <= 0.0 || extraBuckets < 0) {
            return -1;
        }

        return getBucketCount(width, height, areaPerBucket) - extraBuckets;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0.0 || height <= 0.0 || areaPerBucket <= 0.0) {
            return -1;
        }

        return getBucketCount(width * height, areaPerBucket);
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if ( area <= 0.0 || areaPerBucket <= 0.0) {
            return -1;
        }

        return (int) Math.ceil(area/areaPerBucket);
    }
}
