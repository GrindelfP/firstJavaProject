package me.grindelf.shisha;

public class Oak extends Tree{
    Oak(int height, int numberOfBranches, int trunkDiameter) {
        this.height = height;
        this.numberOfBranches = numberOfBranches;
        this.trunkDiameter = trunkDiameter;
        this.leafType = LeafType.LEAF;
    }

    @Override
    public void grow() {
        this.height++;
    }

    @Override
    public void generateNewBranches() {
        this.numberOfBranches++;
    }

    @Override
    public String toString() {
        return "I'm a big beautiful oak of height " + this.height + "and I have " + this.numberOfBranches + "!";
    }
}