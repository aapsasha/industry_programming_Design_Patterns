package org.aapsasha.Composite_Iterator_Visitor.Iterators;

import org.aapsasha.Composite_Iterator_Visitor.Composite.Component;
import org.aapsasha.Composite_Iterator_Visitor.Composite.Directory;
import org.aapsasha.Composite_Iterator_Visitor.Composite.myFile;

import java.io.File;

public class FilesIterator extends Iterator{
    Directory root;
    Directory currentDirectory;
    myFile currentFile;
    myFile nextFile;
    public FilesIterator(Directory root){
        this.root = root;
        findNext(root,0);
        currentFile = nextFile;
        currentDirectory = currentFile.parent;
        nextFile = null;
    }
    private void findFile(Directory root){
        root.children.forEach(c -> {
            if(c instanceof  myFile){
                currentDirectory = root;
                currentFile = (myFile)c;
            }
            else{
                findFile((Directory)c);
            }
        });
    }
    @Override
    public boolean hasMore() {
        if(nextFile != null) {
            return true;
        }
        else{
            return findNext(currentDirectory, (currentDirectory.children.indexOf(currentFile)) + 1);
        }
    }

    private boolean findNext(Directory dir,int ind){
        for(int i =ind; i< dir.children.size(); ++i){
            if(dir.children.get(i) instanceof myFile){
                nextFile = (myFile) dir.children.get(i);
                return true;
            }
            else{
                if(findNext((Directory)dir.children.get(i),0)){
                    return true;
                }
            }
        }
        if(dir == root){
            nextFile = null;
            return false;
        }
        else{
            Directory tmp = dir.parent;
            int index = tmp.children.indexOf(dir);
            return findNext(tmp,index+1);
        }
    }
    @Override
    public void move() throws Exception {
        if(nextFile == null) {
            findNext(currentDirectory, (currentDirectory.children.indexOf(currentFile)) + 1);
        }
        if(nextFile == null){
            throw new Exception();
        }
        else {
            currentFile = nextFile;
            currentDirectory = currentFile.parent;
            nextFile = null;
        }
    }

    @Override
    public Component get() {
        return currentFile;
    }

}
