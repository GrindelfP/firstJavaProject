package me.grindelf.shisha;

public class Pine extends Tree {
    private int numberOfNeedle;

    Pine(int height, int numberOfBranches, int trunkDiameter, int numberOfNeedle) {
        this.height = height;
        this.numberOfBranches = numberOfBranches;
        this.trunkDiameter = trunkDiameter;
        leafType = LeafType.NIDDLE;
        this.numberOfNeedle = numberOfNeedle;
    }
    Pine() {
        height = 50000;
        numberOfBranches = 10000;
        trunkDiameter = 70;
        leafType = LeafType.NIDDLE;
        numberOfNeedle = 500000;
    }


    @Override
    public void grow() {
        this.height += 10;
    }

    @Override
    public void generateNewBranches() {
        this.numberOfBranches += 2;
    }


    /* create method with which a pine can throw its needles int the enemies */
    public void attack(){
        numberOfNeedle -= 20;
        System.out.println("ATATATATATATA!");
    }

    public int getNumberOfNeedle() {
        return numberOfNeedle;
    }
}