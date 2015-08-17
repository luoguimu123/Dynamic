# Dynamic
Dynamic help you to handle the display of a set of images
这是一个图片连播的视图，可实现简单的图片连播，
直接下载并讲DynamicView导入自己的工程即可使用。
<RelativeLayout
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto">

    <com.lgm.dynamicview.DynamicView
        android:layout_width="100dp"
        android:layout_height="100dp"
        android:id="@+id/dynamicView"
        app:oneshot="false"
        app:single_duration="200"/>

    <Button
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="start"
        android:id="@+id/start"
        android:layout_below="@id/dynamicView"/>

    <Button
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="stop"
        android:id="@+id/stop"
        android:layout_below="@id/start"/>

</RelativeLayout>

其中oneshot控制图片组是否重复播放，single_duration控制每个图片的播放时间，
使用实例方法start()开始播放，使用stop方法停止播放。
start应传入需要播放的图片组，传入的格式为List<Integer>,integer为格式为R.drawable.xxx;顺序和播放的顺序一致。
