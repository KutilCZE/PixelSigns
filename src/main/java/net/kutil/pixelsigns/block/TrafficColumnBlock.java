package net.kutil.pixelsigns.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;

import java.util.stream.Stream;

public class TrafficColumnBlock extends Block {
    public static final DirectionProperty FACING = BlockStateProperties.FACING;

    public TrafficColumnBlock(Properties properties){
        super(properties);
        this.setDefaultState(this.stateContainer.getBaseState().with(FACING, Direction.NORTH));
    }

    private static final VoxelShape SHAPE_N = Block.makeCuboidShape(7.5, 7.5, 0, 8.5, 8.5, 16);

    private static final VoxelShape SHAPE_E = Block.makeCuboidShape(0, 7.5, 7.5, 16, 8.5, 8.5);

    private static final VoxelShape SHAPE_S = Block.makeCuboidShape(7.5, 7.5, 0, 8.5, 8.5, 16);

    private static final VoxelShape SHAPE_W = Block.makeCuboidShape(0, 7.5, 7.5, 16, 8.5, 8.5);

    private static final VoxelShape SHAPE_U = Block.makeCuboidShape(7.5, 0, 7.5, 8.5, 16, 8.5);

    private static final VoxelShape SHAPE_D = Block.makeCuboidShape(7.5, 0, 7.5, 8.5, 16, 8.5);

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
            case UP:
                return SHAPE_U;
            case DOWN:
                return SHAPE_D;
            default:
                return SHAPE_N;
        }
    }

    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        return this.getDefaultState().with(FACING, context.getNearestLookingDirection().getOpposite());
    }

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }
}