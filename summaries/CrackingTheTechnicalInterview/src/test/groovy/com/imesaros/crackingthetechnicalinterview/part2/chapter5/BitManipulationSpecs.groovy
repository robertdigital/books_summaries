package com.imesaros.crackingthetechnicalinterview.part2.chapter5

import spock.lang.Specification

import static com.imesaros.crackingthetechnicalinterview.part2.chapter5.BitManipulation.updateBits


class BitManipulationSpecs extends Specification {

    def 'should update bits'() {
        expect:
        updateBits(1024, b, i, 4 + i) == 1024 + b * (1 << i)

        where:
        b  | i
        21 | 2
        14 | 3
        15 | 4
    }
}
