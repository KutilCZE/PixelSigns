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

public class RectangleSignBlock extends Block {
    public static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;

    public RectangleSignBlock(Properties properties){
        super(properties);
        this.setDefaultState(this.stateContainer.getBaseState().with(FACING, Direction.NORTH));
    }

    private static final VoxelShape SHAPE_N = Stream.of(
            Block.makeCuboidShape(3.5, 1.5, 6, 12.5, 14.5, 7),
            Block.makeCuboidShape(6.25, 10.5, 7, 9.75, 11.5, 7.5),
            Block.makeCuboidShape(6.25, 4.5, 7, 9.75, 5.5, 7.5),
            Block.makeCuboidShape(7.5, 0, 7.5, 8.5, 16, 8.5)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR)).get();

    private static final VoxelShape SHAPE_W = Stream.of(
            Block.makeCuboidShape(6, 1.5, 3.5, 7, 14.5, 12.5),
            Block.makeCuboidShape(7, 10.5, 6.25, 7.5, 11.5, 9.75),
            Block.makeCuboidShape(7, 4.5, 6.25, 7.5, 5.5, 9.75),
            Block.makeCuboidShape(7.5, 0, 7.5, 8.5, 16, 8.5)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR)).get();

    private static final VoxelShape SHAPE_S = Stream.of(
            Block.makeCuboidShape(3.5, 1.5, 9, 12.5, 14.5, 10),
            Block.makeCuboidShape(6.25, 10.5, 8.5, 9.75, 11.5, 9),
            Block.makeCuboidShape(6.25, 4.5, 8.5, 9.75, 5.5, 9),
            Block.makeCuboidShape(7.5, 0, 7.5, 8.5, 16, 8.5)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR)).get();

    private static final VoxelShape SHAPE_E = Stream.of(
            Block.makeCuboidShape(9, 1.5, 3.5, 10, 14.5, 12.5),
            Block.makeCuboidShape(8.5, 10.5, 6.25, 9, 11.5, 9.75),
            Block.makeCuboidShape(8.5, 4.5, 6.25, 9, 5.5, 9.75),
            Block.makeCuboidShape(7.5, 0, 7.5, 8.5, 16, 8.5)
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
