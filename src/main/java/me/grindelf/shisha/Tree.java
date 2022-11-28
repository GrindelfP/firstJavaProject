package me.grindelf.shisha;

public abstract class Tree {
    protected int height;
    protected int numberOfBranches;
    protected int trunkDiameter;
    protected LeafType leafType;

    public int getHeight() {
        return height;
    }

    public int getNumberOfBranches() {
        return numberOfBranches;
    }

    public int getTrunkDiameter() {
        return trunkDiameter;
    }

    public LeafType getLeafType() {
        return leafType;
    }

    public Tree() {
        height = 50000;
        numberOfBranches = 10000;
        trunkDiameter = 70;
        leafType = LeafType.LEAF;
    }

    public Tree(int height, int numberOfBranches, int trunkDiameter, LeafType leafType) {
        this.height = height;
        this.numberOfBranches = numberOfBranches;
        this.trunkDiameter = trunkDiameter;
        this.leafType = leafType;
    }

    public abstract void grow();

    public abstract void generateNewBranches();
}
