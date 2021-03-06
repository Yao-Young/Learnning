

## 定义

一棵红黑树是满足如下性质的二叉排序树：

1）根节点和所有外部结点都是黑色的；

2）从根节点到外部结点的途中没有连续连个结点的颜色是红色；

3）所有从根到外部结点的路径上都有相同数目的黑色结点；

## 相关性质

- 结论1

  从根到叶节点的最长路径不大于最短路径的2倍

- 结论2

  有n个内部结点的红黑树的高度$h \leq 2log_2{n+1}$

- 结论3

  新插入红黑树中的结点初始着为红色

  

## 搜索

​	

## 插入

设结点z为新插入的结点，插入过程描述如下：

1）若结点的父节点是黑色的，无须做任何调整

2）如果结点z是根节点，将z着为黑色

3）如果z不是根节点，并且z的父节点z.p是红色的，则分为以下三种情况

- 情况1：z的叔结点y是黑色的，且z是一个右孩子
- 情况2：z的叔结点y是黑色的，且z是一个左孩子
- 情况3：x的叔结点是红色的







## 删除

