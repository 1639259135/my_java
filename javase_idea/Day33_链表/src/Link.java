public interface Link {

    void add(Object data);//添加
    int size();//获取长度
    boolean isEmpty();//判断是否为空
    boolean contains(Object data);//判断数据是否存在
    Object get(int index);//根据索引获得数据
    void set(int index,Object data);//修改数据
    void remove(Object data);//删除数据
    void clear();//清空数据
    Object[] toArray();//返回数据

}
