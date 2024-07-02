package com.example.sbb.question;


import com.example.sbb.DataNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class QuestionService {
    private final QuestionRepository questionRepository;

    public List<Question> getQuestionList() {
        return questionRepository.findAll();
    }

    public Question getQuestion(Integer id) {
        Optional<Question> question = this.questionRepository.findById(id);
        if (question.isPresent()) {
            return question.get();
        } else {
            throw new DataNotFoundException("question not found");
        }
    }

    public void create(String subject, String content) {
        Question q = new Question();
        q.setSubject(subject);
        q.setContent(content);
        q.setCreateDate(LocalDateTime.now());
        this.questionRepository.save(q);
    }

    public Page<Question> getList(int page) {
        // 최신 순으로
        List<Sort.Order> sorts = new ArrayList<>();
        sorts.add(Sort.Order.desc("createDate"));

        // 한 페이지에 10개만 보여줌
        Pageable pageable = PageRequest.of(page, 10, Sort.by(sorts));
        return questionRepository.findAll(pageable);
    }
}
