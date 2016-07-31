# EventDemo
Spring的事件为Bean和Bean之间的消息通信提供了支持。
当一个Bean处理完一个任务之后，希望另外一个Bean能知道并做相应的处理，这时就需要让另一个Bean监听当前Bean的所发的  
**事件**  
这个事件可以理解为桌面应用程序的**点击事件**、**双击事件**  

其它就是常见的观察者模式：  
1.ApplicationContext是Subject和Context  
2.ApplicationListener是Observer  
3.Subject和Observer通过**ApplicationEvent**或其**子类**来进行匹配，只有匹配的Observer才会被调用  
4.ApplicationListener只要注册到ApplicationContext即可  
