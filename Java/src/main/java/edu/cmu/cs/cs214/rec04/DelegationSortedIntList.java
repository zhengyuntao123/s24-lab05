package edu.cmu.cs.cs214.rec04;

/**
 * DelegationSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */

public class DelegationSortedIntList extends SortedIntList{
    // Write your implementation below with API documentation
    private IntegerList list;
    private int tot;

    public DelegationSortedIntList(){
        this.list=new SortedIntList();
        this.tot=0;
    }
    
    @Override
    public boolean add(int num){
        this.tot++;
        return this.list.add(num);
    }

    @Override
    public boolean addAll(IntegerList list){
        this.tot+=list.size();
        return this.list.addAll(list);
    }

    @Override
    public int size(){
        return this.list.size();
    }

    @Override
    public int get(int index){
        return this.list.get(index);
    }

    @Override
    public boolean remove(int num){
        return this.list.remove(num);
    }

    @Override
    public boolean removeAll(IntegerList list){
        return this.list.removeAll(list);
    }
    
    public int getTotalAdded(){
        return this.tot;
    }
}