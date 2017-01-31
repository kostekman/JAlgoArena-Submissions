package com.jalgoarena.ranking

import com.jalgoarena.domain.Problem
import com.jalgoarena.domain.Submission

interface ScoreCalculator {
    fun calculate(userSubmission: Submission, problems: List<Problem>): Double
}
