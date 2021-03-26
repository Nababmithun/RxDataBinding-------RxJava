# RxDataBinding-------RxJava

This repository contains example of using RxJava with Android to solve real-world problems. More examples will be adding day by day and you are also welcome to contribute.

3. Data binding for TextView (using PublishSubject)
Data binding is a pretty cool thing. It will auto update the view if the data source change. This example demonstrates how we can use PublishSubject to bind data with TextView. Here we have 2 EditText where we can enter two number and 1 TextView to show the sumation of those 2 numbers. The sumation will auto update if we change those numbers. This is a basic use of data binding. You can also use Presentation ViewModel pattern.



#Rx---library

  // Rx android
  
    implement  'io.reactivex.rxjava2:rxjava:2.1.3'
    implement  'io.reactivex.rxjava2:rxandroid:2.0.1'
    implement  'com.jakewharton.rxbinding2:rxbinding:2.0.0'

    // butter knife
    
    implement  'com.jakewharton:butterknife:8.8.1'
    annotationProcessor 'com.jakewharton:butterknife-compiler:8.8.1'
