package uz.pdp.adminpanel.mapper;

import org.mapstruct.*;
import uz.pdp.adminpanel.entity.Achievement;
import uz.pdp.adminpanel.entity.Comment;
import uz.pdp.adminpanel.payload.AchievementDto;
import uz.pdp.adminpanel.payload.CommentDto;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface CommentMapper {
    Comment toComment(CommentDto commentDto);

    CommentDto toCommentDTO(Comment comment);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Comment commentUpdate(CommentDto commentDto, @MappingTarget Comment comment);

    List<CommentDto> toCommentDTOs(List<Comment> commentList);

    List<Comment> toComments(List<CommentDto> commentDtoList);
}