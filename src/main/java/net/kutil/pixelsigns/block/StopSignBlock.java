package net.kutil.pixelsigns.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;

import java.util.stream.Stream;

public class StopSignBlock extends Block {
    public static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;

    public StopSignBlock(Properties properties){
        super(properties);
        this.setDefaultState(this.stateContainer.getBaseState().with(FACING, Direction.NORTH));
    }

    private static final VoxelShape SHAPE_N = Stream.of(
            Block.makeCuboidShape(6.5, 10, 7, 9.5, 11, 7.5),
            Block.makeCuboidShape(6.5, 5, 7, 9.5, 6, 7.5),
            Block.makeCuboidShape(7.5, 0, 7.5, 8.5, 16, 8.5),
            Block.makeCuboidShape(4.75, 14, 6, 11.25, 14.5, 7),
            Block.makeCuboidShape(4.25, 13.5, 6, 11.75, 14, 7),
            Block.makeCuboidShape(3.75, 13, 6, 12.25, 13.5, 7),
            Block.makeCuboidShape(3.25, 12.5, 6, 12.75, 13, 7),
            Block.makeCuboidShape(2.75, 12, 6, 13.25, 12.5, 7),
            Block.makeCuboidShape(2.25, 11.5, 6, 13.75, 12, 7),
            Block.makeCuboidShape(1.75, 11, 6, 14.25, 11.5, 7),
            Block.makeCuboidShape(1.25, 5, 6, 14.75, 11, 7),
            Block.makeCuboidShape(1.75, 4.5, 6, 14.25, 5, 7),
            Block.makeCuboidShape(2.25, 4, 6, 13.75, 4.5, 7),
            Block.makeCuboidShape(2.75, 3.5, 6, 13.25, 4, 7),
            Block.makeCuboidShape(3.25, 3, 6, 12.75, 3.5, 7),
            Block.makeCuboidShape(3.75, 2.5, 6, 12.25, 3, 7),
            Block.makeCuboidShape(4.75, 1.5, 6, 11.25, 2, 7),
            Block.makeCuboidShape(4.25, 2, 6, 11.75, 2.5, 7)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR)).get();


    private static final VoxelShape SHAPE_W = Stream.of(
            Block.makeCuboidShape(7, 10, 6.5, 7.5, 11, 9.5),
            Block.makeCuboidShape(7, 5, 6.5, 7.5, 6, 9.5),
            Block.makeCuboidShape(7.5, 0, 7.5, 8.5, 16, 8.5),
            Block.makeCuboidShape(6, 14, 4.75, 7, 14.5, 11.25),
            Block.makeCuboidShape(6, 13.5, 4.25, 7, 14, 11.75),
            Block.makeCuboidShape(6, 13, 3.75, 7, 13.5, 12.25),
            Block.makeCuboidShape(6, 12.5, 3.25, 7, 13, 12.75),
            Block.makeCuboidShape(6, 12, 2.75, 7, 12.5, 13.25),
            Block.makeCuboidShape(6, 11.5, 2.25, 7, 12, 13.75),
            Block.makeCuboidShape(6, 11, 1.75, 7, 11.5, 14.25),
            Block.makeCuboidShape(6, 5, 1.25, 7, 11, 14.75),
            Block.makeCuboidShape(6, 4.5, 1.75, 7, 5, 14.25),
            Block.makeCuboidShape(6, 4, 2.25, 7, 4.5, 13.75),
            Block.makeCuboidShape(6, 3.5, 2.75, 7, 4, 13.25),
            Block.makeCuboidShape(6, 3, 3.25, 7, 3.5, 12.75),
            Block.makeCuboidShape(6, 2.5, 3.75, 7, 3, 12.25),
            Block.makeCuboidShape(6, 1.5, 4.75, 7, 2, 11.25),
            Block.makeCuboidShape(6, 2, 4.25, 7, 2.5, 11.75)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR)).get();

    private static final VoxelShape SHAPE_S = Stream.of(
            Block.makeCuboidShape(6.5, 10, 8.5, 9.5, 11, 9),
            Block.makeCuboidShape(6.5, 5, 8.5, 9.5, 6, 9),
            Block.makeCuboidShape(7.5, 0, 7.5, 8.5, 16, 8.5),
            Block.makeCuboidShape(4.75, 14, 9, 11.25, 14.5, 10),
            Block.makeCuboidShape(4.25, 13.5, 9, 11.75, 14, 10),
            Block.makeCuboidShape(3.75, 13, 9, 12.25, 13.5, 10),
            Block.makeCuboidShape(3.25, 12.5, 9, 12.75, 13, 10),
            Block.makeCuboidShape(2.75, 12, 9, 13.25, 12.5, 10),
            Block.makeCuboidShape(2.25, 11.5, 9, 13.75, 12, 10),
            Block.makeCuboidShape(1.75, 11, 9, 14.25, 11.5, 10),
            Block.makeCuboidShape(1.25, 5, 9, 14.75, 11, 10),
            Block.makeCuboidShape(1.75, 4.5, 9, 14.25, 5, 10),
            Block.makeCuboidShape(2.25, 4, 9, 13.75, 4.5, 10),
            Block.makeCuboidShape(2.75, 3.5, 9, 13.25, 4, 10),
            Block.makeCuboidShape(3.25, 3, 9, 12.75, 3.5, 10),
            Block.makeCuboidShape(3.75, 2.5, 9, 12.25, 3, 10),
            Block.makeCuboidShape(4.75, 1.5, 9, 11.25, 2, 10),
            Block.makeCuboidShape(4.25, 2, 9, 11.75, 2.5, 10)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR)).get();

    private static final VoxelShape SHAPE_E = Stream.of(
            Block.makeCuboidShape(8.5, 10, 6.5, 9, 11, 9.5),
            Block.makeCuboidShape(8.5, 5, 6.5, 9, 6, 9.5),
            Block.makeCuboidShape(7.5, 0, 7.5, 8.5, 16, 8.5),
            Block.makeCuboidShape(9, 14, 4.75, 10, 14.5, 11.25),
            Block.makeCuboidShape(9, 13.5, 4.25, 10, 14, 11.75),
            Block.makeCuboidShape(9, 13, 3.75, 10, 13.5, 12.25),
            Block.makeCuboidShape(9, 12.5, 3.25, 10, 13, 12.75),
            Block.makeCuboidShape(9, 12, 2.75, 10, 12.5, 13.25),
            Block.makeCuboidShape(9, 11.5, 2.25, 10, 12, 13.75),
            Block.makeCuboidShape(9, 11, 1.75, 10, 11.5, 14.25),
            Block.makeCuboidShape(9, 5, 1.25, 10, 11, 14.75),
            Block.makeCuboidShape(9, 4.5, 1.75, 10, 5, 14.25),
            Block.makeCuboidShape(9, 4, 2.25, 10, 4.5, 13.75),
            Block.makeCuboidShape(9, 3.5, 2.75, 10, 4, 13.25),
            Block.makeCuboidShape(9, 3, 3.25, 10, 3.5, 12.75),
            Block.makeCuboidShape(9, 2.5, 3.75, 10, 3, 12.25),
            Block.makeCuboidShape(9, 1.5, 4.75, 10, 2, 11.25),
            Block.makeCuboidShape(9, 2, 4.25, 10, 2.5, 11.75)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR)).get();

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        switch (state.get(FACING))
        {
            case NORTH:
                return SHAPE_N;
            case SOUTH:
                return SHAPE_S;
            case WEST:
                return SHAPE_W;
            case EAST:
                return SHAPE_E;
            default:
                return SHAPE_N;
        }
    }

    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        Direction direction = context.getPlacementHorizontalFacing();
        return this.getDefaultState().with(FACING, context.getPlacementHorizontalFacing().getOpposite());
    }

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }
}
