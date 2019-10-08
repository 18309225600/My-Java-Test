打印出一个JAVA对象的三部分，看看到底长啥样（对象头，实例数据，对其填充）

1.需要依赖一个jar
<dependency>
  <groupId>org.openjdk.jol</groupId>
  <artifactId>jol-core</artifactId>
  <version>0.8</version>
</dependency>

2.打印方式  ClassLayout.parseInstance(obj).toPrintable()