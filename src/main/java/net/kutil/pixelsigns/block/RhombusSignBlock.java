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

public class RhombusSignBlock extends Block {
    public static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;

    public RhombusSignBlock(Properties properties){
        super(properties);
        this.setDefaultState(this.stateContainer.getBaseState().with(FACING, Direction.NORTH));
    }

    private static final VoxelShape SHAPE_N = Stream.of(
            Block.makeCuboidShape(6.5, 9, 7, 9.5, 10, 7.5),
            Block.makeCuboidShape(6.5, 6, 7, 9.5, 7, 7.5),
            Block.makeCuboidShape(7.5, 0, 7.5, 8.5, 16, 8.5),
            Block.makeCuboidShape(7.5, 14, 6, 8.5, 14.5, 7),
            Block.makeCuboidShape(7, 13.5, 6, 9, 14, 7),
            Block.makeCuboidShape(6.5, 13, 6, 9.5, 13.5, 7),
            Block.makeCuboidShape(6, 12.5, 6, 10, 13, 7),
            Block.makeCuboidShape(5.5, 12, 6, 10.5, 12.5, 7),
            Block.makeCuboidShape(5, 11.5, 6, 11, 12, 7),
            Block.makeCuboidShape(4.5, 11, 6, 11.5, 11.5, 7),
            Block.makeCuboidShape(4, 10.5, 6, 12, 11, 7),
            Block.makeCuboidShape(3.5, 10, 6, 12.5, 10.5, 7),
            Block.makeCuboidShape(3, 9.5, 6, 13, 10, 7),
            Block.makeCuboidShape(2.5, 9, 6, 13.5, 9.5, 7),
            Block.makeCuboidShape(2, 8.5, 6, 14, 9, 7),
            Block.makeCuboidShape(1.5, 7.5, 6, 14.5, 8.5, 7),
            Block.makeCuboidShape(2, 7, 6, 14, 7.5, 7),
            Block.makeCuboidShape(2.5, 6.5, 6, 13.5, 7, 7),
            Block.makeCuboidShape(3, 6, 6, 13, 6.5, 7),
            Block.makeCuboidShape(3.5, 5.5, 6, 12.5, 6, 7),
            Block.makeCuboidShape(4, 5, 6, 12, 5.5, 7),
            Block.makeCuboidShape(4.5, 4.5, 6, 11.5, 5, 7),
            Block.makeCuboidShape(5, 4, 6, 11, 4.5, 7),
            Block.makeCuboidShape(5.5, 3.5, 6, 10.5, 4, 7),
            Block.makeCuboidShape(6, 3, 6, 10, 3.5, 7),
            Block.makeCuboidShape(6.5, 2.5, 6, 9.5, 3, 7),
            Block.makeCuboidShape(7.5, 1.5, 6, 8.5, 2, 7),
            Block.makeCuboidShape(7, 2, 6, 9, 2.5, 7)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR)).get();


    private static final VoxelShape SHAPE_W = Stream.of(
            Block.makeCuboidShape(7, 9, 6.5, 7.5, 10, 9.5),
            Block.makeCuboidShape(7, 6, 6.5, 7.5, 7, 9.5),
            Block.makeCuboidShape(7.5, 0, 7.5, 8.5, 16, 8.5),
            Block.makeCuboidShape(6, 14, 7.5, 7, 14.5, 8.5),
            Block.makeCuboidShape(6, 13.5, 7, 7, 14, 9),
            Block.makeCuboidShape(6, 13, 6.5, 7, 13.5, 9.5),
            Block.makeCuboidShape(6, 12.5, 6, 7, 13, 10),
            Block.makeCuboidShape(6, 12, 5.5, 7, 12.5, 10.5),
            Block.makeCuboidShape(6, 11.5, 5, 7, 12, 11),
            Block.makeCuboidShape(6, 11, 4.5, 7, 11.5, 11.5),
            Block.makeCuboidShape(6, 10.5, 4, 7, 11, 12),
            Block.makeCuboidShape(6, 10, 3.5, 7, 10.5, 12.5),
            Block.makeCuboidShape(6, 9.5, 3, 7, 10, 13),
            Block.makeCuboidShape(6, 9, 2.5, 7, 9.5, 13.5),
            Block.makeCuboidShape(6, 8.5, 2, 7, 9, 14),
            Block.makeCuboidShape(6, 7.5, 1.5, 7, 8.5, 14.5),
            Block.makeCuboidShape(6, 7, 2, 7, 7.5, 14),
            Block.makeCuboidShape(6, 6.5, 2.5, 7, 7, 13.5),
            Block.makeCuboidShape(6, 6, 3, 7, 6.5, 13),
            Block.makeCuboidShape(6, 5.5, 3.5, 7, 6, 12.5),
            Block.makeCuboidShape(6, 5, 4, 7, 5.5, 12),
            Block.makeCuboidShape(6, 4.5, 4.5, 7, 5, 11.5),
            Block.makeCuboidShape(6, 4, 5, 7, 4.5, 11),
            Block.makeCuboidShape(6, 3.5, 5.5, 7, 4, 10.5),
            Block.makeCuboidShape(6, 3, 6, 7, 3.5, 10),
            Block.makeCuboidShape(6, 2.5, 6.5, 7, 3, 9.5),
            Block.makeCuboidShape(6, 1.5, 7.5, 7, 2, 8.5),
            Block.makeCuboidShape(6, 2, 7, 7, 2.5, 9)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR)).get();

    private static final VoxelShape SHAPE_S = Stream.of(
            Block.makeCuboidShape(6.5, 9, 8.5, 9.5, 10, 9),
            Block.makeCuboidShape(6.5, 6, 8.5, 9.5, 7, 9),
            Block.makeCuboidShape(7.5, 0, 7.5, 8.5, 16, 8.5),
            Block.makeCuboidShape(7.5, 14, 9, 8.5, 14.5, 10),
            Block.makeCuboidShape(7, 13.5, 9, 9, 14, 10),
            Block.makeCuboidShape(6.5, 13, 9, 9.5, 13.5, 10),
            Block.makeCuboidShape(6, 12.5, 9, 10, 13, 10),
            Block.makeCuboidShape(5.5, 12, 9, 10.5, 12.5, 10),
            Block.makeCuboidShape(5, 11.5, 9, 11, 12, 10),
            Block.makeCuboidShape(4.5, 11, 9, 11.5, 11.5, 10),
            Block.makeCuboidShape(4, 10.5, 9, 12, 11, 10),
            Block.makeCuboidShape(3.5, 10, 9, 12.5, 10.5, 10),
            Block.makeCuboidShape(3, 9.5, 9, 13, 10, 10),
            Block.makeCuboidShape(2.5, 9, 9, 13.5, 9.5, 10),
            Block.makeCuboidShape(2, 8.5, 9, 14, 9, 10),
            Block.makeCuboidShape(1.5, 7.5, 9, 14.5, 8.5, 10),
            Block.makeCuboidShape(2, 7, 9, 14, 7.5, 10),
            Block.makeCuboidShape(2.5, 6.5, 9, 13.5, 7, 10),
            Block.makeCuboidShape(3, 6, 9, 13, 6.5, 10),
            Block.makeCuboidShape(3.5, 5.5, 9, 12.5, 6, 10),
            Block.makeCuboidShape(4, 5, 9, 12, 5.5, 10),
            Block.makeCuboidShape(4.5, 4.5, 9, 11.5, 5, 10),
            Block.makeCuboidShape(5, 4, 9, 11, 4.5, 10),
            Block.makeCuboidShape(5.5, 3.5, 9, 10.5, 4, 10),
            Block.makeCuboidShape(6, 3, 9, 10, 3.5, 10),
            Block.makeCuboidShape(6.5, 2.5, 9, 9.5, 3, 10),
            Block.makeCuboidShape(7.5, 1.5, 9, 8.5, 2, 10),
            Block.makeCuboidShape(7, 2, 9, 9, 2.5, 10)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR)).get();

    private static final VoxelShape SHAPE_E = Stream.of(
            Block.makeCuboidShape(8.5, 9, 6.5, 9, 10, 9.5),
            Block.makeCuboidShape(8.5, 6, 6.5, 9, 7, 9.5),
            Block.makeCuboidShape(7.5, 0, 7.5, 8.5, 16, 8.5),
            Block.makeCuboidShape(9, 14, 7.5, 10, 14.5, 8.5),
            Block.makeCuboidShape(9, 13.5, 7, 10, 14, 9),
            Block.makeCuboidShape(9, 13, 6.5, 10, 13.5, 9.5),
            Block.makeCuboidShape(9, 12.5, 6, 10, 13, 10),
            Block.makeCuboidShape(9, 12, 5.5, 10, 12.5, 10.5),
            Block.makeCuboidShape(9, 11.5, 5, 10, 12, 11),
            Block.makeCuboidShape(9, 11, 4.5, 10, 11.5, 11.5),
            Block.makeCuboidShape(9, 10.5, 4, 10, 11, 12),
            Block.makeCuboidShape(9, 10, 3.5, 10, 10.5, 12.5),
            Block.makeCuboidShape(9, 9.5, 3, 10, 10, 13),
            Block.makeCuboidShape(9, 9, 2.5, 10, 9.5, 13.5),
            Block.makeCuboidShape(9, 8.5, 2, 10, 9, 14),
            Block.makeCuboidShape(9, 7.5, 1.5, 10, 8.5, 14.5),
            Block.makeCuboidShape(9, 7, 2, 10, 7.5, 14),
            Block.makeCuboidShape(9, 6.5, 2.5, 10, 7, 13.5),
            Block.makeCuboidShape(9, 6, 3, 10, 6.5, 13),
            Block.makeCuboidShape(9, 5.5, 3.5, 10, 6, 12.5),
            Block.makeCuboidShape(9, 5, 4, 10, 5.5, 12),
            Block.makeCuboidShape(9, 4.5, 4.5, 10, 5, 11.5),
            Block.makeCuboidShape(9, 4, 5, 10, 4.5, 11),
            Block.makeCuboidShape(9, 3.5, 5.5, 10, 4, 10.5),
            Block.makeCuboidShape(9, 3, 6, 10, 3.5, 10),
            Block.makeCuboidShape(9, 2.5, 6.5, 10, 3, 9.5),
            Block.makeCuboidShape(9, 1.5, 7.5, 10, 2, 8.5),
            Block.makeCuboidShape(9, 2, 7, 10, 2.5, 9)
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