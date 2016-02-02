/**
 * Copyright (c) 2008, http://www.snakeyaml.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// line 1 "RagelMachine.rl"
package org.yaml.snakeyaml.resolver;

//Source for Ragel 6.3

/**
 * Generated by Ragel 6.3 (http://www.complang.org/ragel/)
 * 
 * @see http://www.complang.org/ragel/
 */
public class RagelMachine {

    // line 15 "RagelMachine.java"
    private static byte[] init__snakeyaml_actions_0() {
        return new byte[] { 0, 1, 0, 1, 1, 1, 2, 1, 3, 1, 4, 1, 5, 1, 6 };
    }

    private static final byte _snakeyaml_actions[] = init__snakeyaml_actions_0();

    private static short[] init__snakeyaml_key_offsets_0() {
        return new short[] { 0, 0, 20, 24, 28, 30, 32, 34, 35, 36, 37, 42, 46, 50, 52, 56, 59, 66,
                70, 74, 80, 82, 83, 84, 85, 87, 90, 92, 98, 102, 105, 106, 108, 110, 111, 113, 115,
                120, 122, 124, 126, 130, 132, 133, 135, 141, 147, 152, 157, 158, 160, 161, 162,
                163, 164, 165, 166, 170, 171, 172, 173, 174, 178, 179, 180, 182, 183, 184, 186,
                187, 188, 189, 191, 193, 194, 195, 195, 200, 202, 202, 211, 218, 224, 227, 234,
                239, 243, 245, 250, 253, 254, 263, 270, 277, 285, 291, 294, 295, 295, 302, 306,
                311, 316, 321, 327, 327, 327 };
    }

    private static final short _snakeyaml_key_offsets[] = init__snakeyaml_key_offsets_0();

    private static char[] init__snakeyaml_trans_keys_0() {
        return new char[] { 32, 43, 45, 46, 48, 60, 61, 70, 78, 79, 84, 89, 102, 110, 111, 116,
                121, 126, 49, 57, 46, 48, 49, 57, 73, 105, 48, 57, 43, 45, 48, 57, 78, 110, 70,
                102, 110, 46, 58, 95, 48, 57, 48, 53, 54, 57, 46, 58, 48, 57, 46, 58, 46, 95, 48,
                57, 95, 48, 49, 95, 48, 57, 65, 70, 97, 102, 48, 53, 54, 57, 48, 53, 54, 57, 73,
                78, 105, 110, 48, 57, 65, 97, 78, 97, 110, 48, 57, 45, 48, 57, 48, 57, 9, 32, 84,
                116, 48, 57, 9, 32, 48, 57, 58, 48, 57, 58, 48, 57, 48, 57, 58, 48, 57, 48, 57, 9,
                32, 43, 45, 90, 48, 57, 48, 57, 48, 57, 9, 32, 84, 116, 48, 57, 45, 48, 57, 9, 32,
                84, 116, 48, 57, 45, 46, 58, 95, 48, 57, 46, 58, 95, 48, 57, 46, 58, 95, 48, 57,
                60, 65, 97, 76, 83, 69, 108, 115, 101, 79, 85, 111, 117, 76, 76, 108, 108, 70, 78,
                102, 110, 70, 102, 82, 114, 85, 117, 69, 101, 83, 115, 97, 111, 117, 102, 110, 114,
                101, 69, 95, 101, 48, 57, 48, 57, 46, 58, 95, 98, 120, 48, 55, 56, 57, 46, 58, 95,
                48, 55, 56, 57, 46, 95, 48, 55, 56, 57, 95, 48, 49, 95, 48, 57, 65, 70, 97, 102,
                46, 58, 95, 48, 57, 46, 58, 48, 57, 46, 58, 46, 58, 95, 48, 57, 58, 48, 57, 58, 46,
                58, 95, 98, 120, 48, 55, 56, 57, 46, 58, 95, 48, 55, 56, 57, 46, 58, 95, 48, 55,
                56, 57, 45, 46, 58, 95, 48, 55, 56, 57, 9, 32, 43, 45, 46, 90, 58, 48, 57, 58, 9,
                32, 43, 45, 90, 48, 57, 9, 32, 84, 116, 46, 58, 95, 48, 57, 46, 58, 95, 48, 57, 46,
                58, 95, 48, 57, 45, 46, 58, 95, 48, 57, 0 };
    }

    private static final char _snakeyaml_trans_keys[] = init__snakeyaml_trans_keys_0();

    private static byte[] init__snakeyaml_single_lengths_0() {
        return new byte[] { 0, 18, 2, 2, 2, 0, 2, 1, 1, 1, 3, 0, 2, 2, 2, 1, 1, 0, 0, 4, 2, 1, 1,
                1, 0, 1, 0, 4, 2, 1, 1, 0, 0, 1, 0, 0, 5, 0, 0, 0, 4, 0, 1, 0, 4, 4, 3, 3, 1, 2, 1,
                1, 1, 1, 1, 1, 4, 1, 1, 1, 1, 4, 1, 1, 2, 1, 1, 2, 1, 1, 1, 2, 2, 1, 1, 0, 3, 0, 0,
                5, 3, 2, 1, 1, 3, 2, 2, 3, 1, 1, 5, 3, 3, 4, 6, 1, 1, 0, 5, 4, 3, 3, 3, 4, 0, 0, 0 };
    }

    private static final byte _snakeyaml_single_lengths[] = init__snakeyaml_single_lengths_0();

    private static byte[] init__snakeyaml_range_lengths_0() {
        return new byte[] { 0, 1, 1, 1, 0, 1, 0, 0, 0, 0, 1, 2, 1, 0, 1, 1, 3, 2, 2, 1, 0, 0, 0, 0,
                1, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 2,
                2, 2, 1, 3, 1, 1, 0, 1, 1, 0, 2, 2, 2, 2, 0, 1, 0, 0, 1, 0, 1, 1, 1, 1, 0, 0, 0 };
    }

    private static final byte _snakeyaml_range_lengths[] = init__snakeyaml_range_lengths_0();

    private static short[] init__snakeyaml_index_offsets_0() {
        return new short[] { 0, 0, 20, 24, 28, 31, 33, 36, 38, 40, 42, 47, 50, 54, 57, 61, 64, 69,
                72, 75, 81, 84, 86, 88, 90, 92, 95, 97, 103, 107, 110, 112, 114, 116, 118, 120,
                122, 128, 130, 132, 134, 139, 141, 143, 145, 151, 157, 162, 167, 169, 172, 174,
                176, 178, 180, 182, 184, 189, 191, 193, 195, 197, 202, 204, 206, 209, 211, 213,
                216, 218, 220, 222, 225, 228, 230, 232, 233, 238, 240, 241, 249, 255, 260, 263,
                268, 273, 277, 280, 285, 288, 290, 298, 304, 310, 317, 324, 327, 329, 330, 337,
                342, 347, 352, 357, 363, 364, 365 };
    }

    private static final short _snakeyaml_index_offsets[] = init__snakeyaml_index_offsets_0();

    private static byte[] init__snakeyaml_indicies_0() {
        return new byte[] { 0, 2, 2, 3, 4, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 0, 5, 1, 18,
                19, 20, 1, 22, 23, 21, 1, 24, 24, 1, 25, 1, 26, 27, 1, 28, 1, 28, 1, 27, 1, 21, 30,
                31, 29, 1, 32, 33, 1, 25, 30, 33, 1, 25, 30, 1, 21, 31, 31, 1, 34, 34, 1, 35, 35,
                35, 35, 1, 36, 37, 1, 38, 39, 1, 22, 40, 23, 41, 21, 1, 42, 42, 1, 28, 1, 43, 1,
                28, 1, 44, 1, 45, 46, 1, 47, 1, 48, 48, 50, 50, 49, 1, 48, 48, 51, 1, 53, 52, 1,
                53, 1, 54, 1, 55, 1, 56, 1, 57, 1, 58, 1, 59, 59, 60, 60, 61, 1, 62, 1, 63, 1, 61,
                1, 48, 48, 50, 50, 1, 51, 1, 64, 1, 65, 1, 48, 48, 50, 50, 66, 1, 67, 21, 30, 31,
                29, 1, 21, 30, 31, 68, 1, 21, 30, 31, 69, 1, 70, 1, 71, 72, 1, 73, 1, 74, 1, 75, 1,
                76, 1, 77, 1, 75, 1, 75, 78, 75, 79, 1, 80, 1, 0, 1, 81, 1, 0, 1, 82, 75, 83, 75,
                1, 75, 1, 75, 1, 84, 85, 1, 74, 1, 77, 1, 86, 87, 1, 75, 1, 75, 1, 72, 1, 75, 79,
                1, 83, 75, 1, 85, 1, 87, 1, 1, 88, 21, 88, 21, 1, 25, 1, 1, 21, 30, 90, 91, 92, 89,
                29, 1, 21, 30, 90, 89, 29, 1, 21, 90, 90, 31, 1, 34, 34, 1, 35, 35, 35, 35, 1, 21,
                93, 94, 20, 1, 25, 93, 37, 1, 25, 93, 1, 21, 95, 94, 94, 1, 95, 39, 1, 95, 1, 21,
                30, 90, 91, 92, 96, 97, 1, 21, 30, 90, 98, 69, 1, 21, 30, 90, 99, 68, 1, 67, 21,
                30, 90, 89, 29, 1, 59, 59, 60, 60, 100, 61, 1, 102, 101, 1, 102, 1, 1, 59, 59, 60,
                60, 61, 100, 1, 48, 48, 50, 50, 1, 21, 93, 94, 103, 1, 21, 93, 94, 104, 1, 21, 93,
                94, 105, 1, 67, 21, 93, 94, 20, 1, 1, 1, 1, 0 };
    }

    private static final byte _snakeyaml_indicies[] = init__snakeyaml_indicies_0();

    private static byte[] init__snakeyaml_trans_targs_0() {
        return new byte[] { 75, 0, 2, 19, 90, 100, 48, 105, 49, 56, 61, 64, 67, 70, 71, 72, 73, 74,
                3, 79, 84, 76, 6, 9, 5, 77, 7, 8, 78, 10, 11, 14, 12, 13, 82, 83, 85, 86, 88, 89,
                20, 22, 21, 23, 25, 26, 42, 27, 28, 40, 41, 29, 30, 31, 32, 33, 34, 35, 94, 36, 37,
                97, 95, 39, 43, 44, 99, 24, 45, 46, 104, 50, 53, 51, 52, 106, 54, 55, 57, 59, 58,
                60, 62, 63, 65, 66, 68, 69, 4, 80, 81, 15, 16, 17, 87, 18, 91, 47, 92, 93, 98, 96,
                38, 101, 102, 103 };
    }

    private static final byte _snakeyaml_trans_targs[] = init__snakeyaml_trans_targs_0();

    // private static byte[] init__snakeyaml_trans_actions_0() {
    // return new byte[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
    // 0, 0, 0, 0, 0, 0,
    // 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
    // 0, 0, 0, 0,
    // 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
    // 0, 0, 0, 0,
    // 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
    // 0, 0 };
    // }

    // private static final byte _snakeyaml_trans_actions[] =
    // init__snakeyaml_trans_actions_0();

    private static byte[] init__snakeyaml_eof_actions_0() {
        return new byte[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 11, 11, 11,
                9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 13, 13, 13, 13, 13, 13, 9, 9, 9, 9, 3,
                7, 1 };
    }

    private static final byte _snakeyaml_eof_actions[] = init__snakeyaml_eof_actions_0();

    static final int snakeyaml_start = 1;
    static final int snakeyaml_error = 0;

    static final int snakeyaml_en_main = 1;

    // line 53 "RagelMachine.rl"

    public String scan(String scalar) {
        if (scalar == null) {
            throw new NullPointerException("Scalar must be provided.");
        }
        String tag = null;
        int cs = 0;
        int p = 0;
        int pe = scalar.length();
        int eof = pe;
        char[] data;
        if (pe == 0) {
            // NULL value
            data = new char[] { '~' };
            pe = 1;
            eof = 1;
        } else {
            data = scalar.toCharArray();
        }

        // line 257 "RagelMachine.java"
        {
            cs = snakeyaml_start;
        }

        // line 262 "RagelMachine.java"
        {
            int _klen;
            int _trans = 0;
            int _keys;
            int _goto_targ = 0;

            _goto: while (true) {
                switch (_goto_targ) {
                case 0:
                    if (p == pe) {
                        _goto_targ = 4;
                        continue _goto;
                    }
                    if (cs == 0) {
                        _goto_targ = 5;
                        continue _goto;
                    }
                case 1:
                    _match: do {
                        _keys = _snakeyaml_key_offsets[cs];
                        _trans = _snakeyaml_index_offsets[cs];
                        _klen = _snakeyaml_single_lengths[cs];
                        if (_klen > 0) {
                            int _lower = _keys;
                            int _mid;
                            int _upper = _keys + _klen - 1;
                            while (true) {
                                if (_upper < _lower)
                                    break;

                                _mid = _lower + ((_upper - _lower) >> 1);
                                if (data[p] < _snakeyaml_trans_keys[_mid])
                                    _upper = _mid - 1;
                                else if (data[p] > _snakeyaml_trans_keys[_mid])
                                    _lower = _mid + 1;
                                else {
                                    _trans += (_mid - _keys);
                                    break _match;
                                }
                            }
                            _keys += _klen;
                            _trans += _klen;
                        }

                        _klen = _snakeyaml_range_lengths[cs];
                        if (_klen > 0) {
                            int _lower = _keys;
                            int _mid;
                            int _upper = _keys + (_klen << 1) - 2;
                            while (true) {
                                if (_upper < _lower)
                                    break;

                                _mid = _lower + (((_upper - _lower) >> 1) & ~1);
                                if (data[p] < _snakeyaml_trans_keys[_mid])
                                    _upper = _mid - 2;
                                else if (data[p] > _snakeyaml_trans_keys[_mid + 1])
                                    _lower = _mid + 2;
                                else {
                                    _trans += ((_mid - _keys) >> 1);
                                    break _match;
                                }
                            }
                            _trans += _klen;
                        }
                    } while (false);

                    _trans = _snakeyaml_indicies[_trans];
                    cs = _snakeyaml_trans_targs[_trans];

                case 2:
                    if (cs == 0) {
                        _goto_targ = 5;
                        continue _goto;
                    }
                    if (++p != pe) {
                        _goto_targ = 1;
                        continue _goto;
                    }
                case 4:
                    if (p == eof) {
                        int __acts = _snakeyaml_eof_actions[cs];
                        int __nacts = (int) _snakeyaml_actions[__acts++];
                        while (__nacts-- > 0) {
                            switch (_snakeyaml_actions[__acts++]) {
                            case 0:
                            // line 14 "RagelMachine.rl"
                            {
                                tag = "tag:yaml.org,2002:bool";
                            }
                                break;
                            case 1:
                            // line 15 "RagelMachine.rl"
                            {
                                tag = "tag:yaml.org,2002:merge";
                            }
                                break;
                            case 2:
                            // line 16 "RagelMachine.rl"
                            {
                                tag = "tag:yaml.org,2002:null";
                            }
                                break;
                            case 3:
                            // line 17 "RagelMachine.rl"
                            {
                                tag = "tag:yaml.org,2002:value";
                            }
                                break;
                            case 4:
                            // line 18 "RagelMachine.rl"
                            {
                                tag = "tag:yaml.org,2002:int";
                            }
                                break;
                            case 5:
                            // line 19 "RagelMachine.rl"
                            {
                                tag = "tag:yaml.org,2002:float";
                            }
                                break;
                            case 6:
                            // line 20 "RagelMachine.rl"
                            {
                                tag = "tag:yaml.org,2002:timestamp";
                            }
                                break;
                            // line 377 "RagelMachine.java"
                            }
                        }
                    }

                case 5:
                }
                break;
            }
        }
        // line 77 "RagelMachine.rl"

        return tag;
    }
}