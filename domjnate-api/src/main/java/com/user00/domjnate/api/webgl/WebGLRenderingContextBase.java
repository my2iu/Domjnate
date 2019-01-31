package com.user00.domjnate.api.webgl;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true,name="WebGLRenderingContextBase")
public interface WebGLRenderingContextBase
{
@JsProperty(name="canvas")
com.user00.domjnate.api.html.HTMLCanvasElement getCanvas();
@JsProperty(name="drawingBufferHeight")
double getDrawingBufferHeight();
@JsProperty(name="drawingBufferWidth")
double getDrawingBufferWidth();
@JsProperty(name="ACTIVE_ATTRIBUTES")
double ACTIVE_ATTRIBUTES();
@JsProperty(name="ACTIVE_TEXTURE")
double ACTIVE_TEXTURE();
@JsProperty(name="ACTIVE_UNIFORMS")
double ACTIVE_UNIFORMS();
@JsProperty(name="ALIASED_LINE_WIDTH_RANGE")
double ALIASED_LINE_WIDTH_RANGE();
@JsProperty(name="ALIASED_POINT_SIZE_RANGE")
double ALIASED_POINT_SIZE_RANGE();
@JsProperty(name="ALPHA")
double ALPHA();
@JsProperty(name="ALPHA_BITS")
double ALPHA_BITS();
@JsProperty(name="ALWAYS")
double ALWAYS();
@JsProperty(name="ARRAY_BUFFER")
double ARRAY_BUFFER();
@JsProperty(name="ARRAY_BUFFER_BINDING")
double ARRAY_BUFFER_BINDING();
@JsProperty(name="ATTACHED_SHADERS")
double ATTACHED_SHADERS();
@JsProperty(name="BACK")
double BACK();
@JsProperty(name="BLEND")
double BLEND();
@JsProperty(name="BLEND_COLOR")
double BLEND_COLOR();
@JsProperty(name="BLEND_DST_ALPHA")
double BLEND_DST_ALPHA();
@JsProperty(name="BLEND_DST_RGB")
double BLEND_DST_RGB();
@JsProperty(name="BLEND_EQUATION")
double BLEND_EQUATION();
@JsProperty(name="BLEND_EQUATION_ALPHA")
double BLEND_EQUATION_ALPHA();
@JsProperty(name="BLEND_EQUATION_RGB")
double BLEND_EQUATION_RGB();
@JsProperty(name="BLEND_SRC_ALPHA")
double BLEND_SRC_ALPHA();
@JsProperty(name="BLEND_SRC_RGB")
double BLEND_SRC_RGB();
@JsProperty(name="BLUE_BITS")
double BLUE_BITS();
@JsProperty(name="BOOL")
double BOOL();
@JsProperty(name="BOOL_VEC2")
double BOOL_VEC2();
@JsProperty(name="BOOL_VEC3")
double BOOL_VEC3();
@JsProperty(name="BOOL_VEC4")
double BOOL_VEC4();
@JsProperty(name="BROWSER_DEFAULT_WEBGL")
double BROWSER_DEFAULT_WEBGL();
@JsProperty(name="BUFFER_SIZE")
double BUFFER_SIZE();
@JsProperty(name="BUFFER_USAGE")
double BUFFER_USAGE();
@JsProperty(name="BYTE")
double BYTE();
@JsProperty(name="CCW")
double CCW();
@JsProperty(name="CLAMP_TO_EDGE")
double CLAMP_TO_EDGE();
@JsProperty(name="COLOR_ATTACHMENT0")
double COLOR_ATTACHMENT0();
@JsProperty(name="COLOR_BUFFER_BIT")
double COLOR_BUFFER_BIT();
@JsProperty(name="COLOR_CLEAR_VALUE")
double COLOR_CLEAR_VALUE();
@JsProperty(name="COLOR_WRITEMASK")
double COLOR_WRITEMASK();
@JsProperty(name="COMPILE_STATUS")
double COMPILE_STATUS();
@JsProperty(name="COMPRESSED_TEXTURE_FORMATS")
double COMPRESSED_TEXTURE_FORMATS();
@JsProperty(name="CONSTANT_ALPHA")
double CONSTANT_ALPHA();
@JsProperty(name="CONSTANT_COLOR")
double CONSTANT_COLOR();
@JsProperty(name="CONTEXT_LOST_WEBGL")
double CONTEXT_LOST_WEBGL();
@JsProperty(name="CULL_FACE")
double CULL_FACE();
@JsProperty(name="CULL_FACE_MODE")
double CULL_FACE_MODE();
@JsProperty(name="CURRENT_PROGRAM")
double CURRENT_PROGRAM();
@JsProperty(name="CURRENT_VERTEX_ATTRIB")
double CURRENT_VERTEX_ATTRIB();
@JsProperty(name="CW")
double CW();
@JsProperty(name="DECR")
double DECR();
@JsProperty(name="DECR_WRAP")
double DECR_WRAP();
@JsProperty(name="DELETE_STATUS")
double DELETE_STATUS();
@JsProperty(name="DEPTH_ATTACHMENT")
double DEPTH_ATTACHMENT();
@JsProperty(name="DEPTH_BITS")
double DEPTH_BITS();
@JsProperty(name="DEPTH_BUFFER_BIT")
double DEPTH_BUFFER_BIT();
@JsProperty(name="DEPTH_CLEAR_VALUE")
double DEPTH_CLEAR_VALUE();
@JsProperty(name="DEPTH_COMPONENT")
double DEPTH_COMPONENT();
@JsProperty(name="DEPTH_COMPONENT16")
double DEPTH_COMPONENT16();
@JsProperty(name="DEPTH_FUNC")
double DEPTH_FUNC();
@JsProperty(name="DEPTH_RANGE")
double DEPTH_RANGE();
@JsProperty(name="DEPTH_STENCIL")
double DEPTH_STENCIL();
@JsProperty(name="DEPTH_STENCIL_ATTACHMENT")
double DEPTH_STENCIL_ATTACHMENT();
@JsProperty(name="DEPTH_TEST")
double DEPTH_TEST();
@JsProperty(name="DEPTH_WRITEMASK")
double DEPTH_WRITEMASK();
@JsProperty(name="DITHER")
double DITHER();
@JsProperty(name="DONT_CARE")
double DONT_CARE();
@JsProperty(name="DST_ALPHA")
double DST_ALPHA();
@JsProperty(name="DST_COLOR")
double DST_COLOR();
@JsProperty(name="DYNAMIC_DRAW")
double DYNAMIC_DRAW();
@JsProperty(name="ELEMENT_ARRAY_BUFFER")
double ELEMENT_ARRAY_BUFFER();
@JsProperty(name="ELEMENT_ARRAY_BUFFER_BINDING")
double ELEMENT_ARRAY_BUFFER_BINDING();
@JsProperty(name="EQUAL")
double EQUAL();
@JsProperty(name="FASTEST")
double FASTEST();
@JsProperty(name="FLOAT")
double FLOAT();
@JsProperty(name="FLOAT_MAT2")
double FLOAT_MAT2();
@JsProperty(name="FLOAT_MAT3")
double FLOAT_MAT3();
@JsProperty(name="FLOAT_MAT4")
double FLOAT_MAT4();
@JsProperty(name="FLOAT_VEC2")
double FLOAT_VEC2();
@JsProperty(name="FLOAT_VEC3")
double FLOAT_VEC3();
@JsProperty(name="FLOAT_VEC4")
double FLOAT_VEC4();
@JsProperty(name="FRAGMENT_SHADER")
double FRAGMENT_SHADER();
@JsProperty(name="FRAMEBUFFER")
double FRAMEBUFFER();
@JsProperty(name="FRAMEBUFFER_ATTACHMENT_OBJECT_NAME")
double FRAMEBUFFER_ATTACHMENT_OBJECT_NAME();
@JsProperty(name="FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE")
double FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE();
@JsProperty(name="FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE")
double FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE();
@JsProperty(name="FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL")
double FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL();
@JsProperty(name="FRAMEBUFFER_BINDING")
double FRAMEBUFFER_BINDING();
@JsProperty(name="FRAMEBUFFER_COMPLETE")
double FRAMEBUFFER_COMPLETE();
@JsProperty(name="FRAMEBUFFER_INCOMPLETE_ATTACHMENT")
double FRAMEBUFFER_INCOMPLETE_ATTACHMENT();
@JsProperty(name="FRAMEBUFFER_INCOMPLETE_DIMENSIONS")
double FRAMEBUFFER_INCOMPLETE_DIMENSIONS();
@JsProperty(name="FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT")
double FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT();
@JsProperty(name="FRAMEBUFFER_UNSUPPORTED")
double FRAMEBUFFER_UNSUPPORTED();
@JsProperty(name="FRONT")
double FRONT();
@JsProperty(name="FRONT_AND_BACK")
double FRONT_AND_BACK();
@JsProperty(name="FRONT_FACE")
double FRONT_FACE();
@JsProperty(name="FUNC_ADD")
double FUNC_ADD();
@JsProperty(name="FUNC_REVERSE_SUBTRACT")
double FUNC_REVERSE_SUBTRACT();
@JsProperty(name="FUNC_SUBTRACT")
double FUNC_SUBTRACT();
@JsProperty(name="GENERATE_MIPMAP_HINT")
double GENERATE_MIPMAP_HINT();
@JsProperty(name="GEQUAL")
double GEQUAL();
@JsProperty(name="GREATER")
double GREATER();
@JsProperty(name="GREEN_BITS")
double GREEN_BITS();
@JsProperty(name="HIGH_FLOAT")
double HIGH_FLOAT();
@JsProperty(name="HIGH_INT")
double HIGH_INT();
@JsProperty(name="IMPLEMENTATION_COLOR_READ_FORMAT")
double IMPLEMENTATION_COLOR_READ_FORMAT();
@JsProperty(name="IMPLEMENTATION_COLOR_READ_TYPE")
double IMPLEMENTATION_COLOR_READ_TYPE();
@JsProperty(name="INCR")
double INCR();
@JsProperty(name="INCR_WRAP")
double INCR_WRAP();
@JsProperty(name="INT")
double INT();
@JsProperty(name="INT_VEC2")
double INT_VEC2();
@JsProperty(name="INT_VEC3")
double INT_VEC3();
@JsProperty(name="INT_VEC4")
double INT_VEC4();
@JsProperty(name="INVALID_ENUM")
double INVALID_ENUM();
@JsProperty(name="INVALID_FRAMEBUFFER_OPERATION")
double INVALID_FRAMEBUFFER_OPERATION();
@JsProperty(name="INVALID_OPERATION")
double INVALID_OPERATION();
@JsProperty(name="INVALID_VALUE")
double INVALID_VALUE();
@JsProperty(name="INVERT")
double INVERT();
@JsProperty(name="KEEP")
double KEEP();
@JsProperty(name="LEQUAL")
double LEQUAL();
@JsProperty(name="LESS")
double LESS();
@JsProperty(name="LINEAR")
double LINEAR();
@JsProperty(name="LINEAR_MIPMAP_LINEAR")
double LINEAR_MIPMAP_LINEAR();
@JsProperty(name="LINEAR_MIPMAP_NEAREST")
double LINEAR_MIPMAP_NEAREST();
@JsProperty(name="LINES")
double LINES();
@JsProperty(name="LINE_LOOP")
double LINE_LOOP();
@JsProperty(name="LINE_STRIP")
double LINE_STRIP();
@JsProperty(name="LINE_WIDTH")
double LINE_WIDTH();
@JsProperty(name="LINK_STATUS")
double LINK_STATUS();
@JsProperty(name="LOW_FLOAT")
double LOW_FLOAT();
@JsProperty(name="LOW_INT")
double LOW_INT();
@JsProperty(name="LUMINANCE")
double LUMINANCE();
@JsProperty(name="LUMINANCE_ALPHA")
double LUMINANCE_ALPHA();
@JsProperty(name="MAX_COMBINED_TEXTURE_IMAGE_UNITS")
double MAX_COMBINED_TEXTURE_IMAGE_UNITS();
@JsProperty(name="MAX_CUBE_MAP_TEXTURE_SIZE")
double MAX_CUBE_MAP_TEXTURE_SIZE();
@JsProperty(name="MAX_FRAGMENT_UNIFORM_VECTORS")
double MAX_FRAGMENT_UNIFORM_VECTORS();
@JsProperty(name="MAX_RENDERBUFFER_SIZE")
double MAX_RENDERBUFFER_SIZE();
@JsProperty(name="MAX_TEXTURE_IMAGE_UNITS")
double MAX_TEXTURE_IMAGE_UNITS();
@JsProperty(name="MAX_TEXTURE_SIZE")
double MAX_TEXTURE_SIZE();
@JsProperty(name="MAX_VARYING_VECTORS")
double MAX_VARYING_VECTORS();
@JsProperty(name="MAX_VERTEX_ATTRIBS")
double MAX_VERTEX_ATTRIBS();
@JsProperty(name="MAX_VERTEX_TEXTURE_IMAGE_UNITS")
double MAX_VERTEX_TEXTURE_IMAGE_UNITS();
@JsProperty(name="MAX_VERTEX_UNIFORM_VECTORS")
double MAX_VERTEX_UNIFORM_VECTORS();
@JsProperty(name="MAX_VIEWPORT_DIMS")
double MAX_VIEWPORT_DIMS();
@JsProperty(name="MEDIUM_FLOAT")
double MEDIUM_FLOAT();
@JsProperty(name="MEDIUM_INT")
double MEDIUM_INT();
@JsProperty(name="MIRRORED_REPEAT")
double MIRRORED_REPEAT();
@JsProperty(name="NEAREST")
double NEAREST();
@JsProperty(name="NEAREST_MIPMAP_LINEAR")
double NEAREST_MIPMAP_LINEAR();
@JsProperty(name="NEAREST_MIPMAP_NEAREST")
double NEAREST_MIPMAP_NEAREST();
@JsProperty(name="NEVER")
double NEVER();
@JsProperty(name="NICEST")
double NICEST();
@JsProperty(name="NONE")
double NONE();
@JsProperty(name="NOTEQUAL")
double NOTEQUAL();
@JsProperty(name="NO_ERROR")
double NO_ERROR();
@JsProperty(name="ONE")
double ONE();
@JsProperty(name="ONE_MINUS_CONSTANT_ALPHA")
double ONE_MINUS_CONSTANT_ALPHA();
@JsProperty(name="ONE_MINUS_CONSTANT_COLOR")
double ONE_MINUS_CONSTANT_COLOR();
@JsProperty(name="ONE_MINUS_DST_ALPHA")
double ONE_MINUS_DST_ALPHA();
@JsProperty(name="ONE_MINUS_DST_COLOR")
double ONE_MINUS_DST_COLOR();
@JsProperty(name="ONE_MINUS_SRC_ALPHA")
double ONE_MINUS_SRC_ALPHA();
@JsProperty(name="ONE_MINUS_SRC_COLOR")
double ONE_MINUS_SRC_COLOR();
@JsProperty(name="OUT_OF_MEMORY")
double OUT_OF_MEMORY();
@JsProperty(name="PACK_ALIGNMENT")
double PACK_ALIGNMENT();
@JsProperty(name="POINTS")
double POINTS();
@JsProperty(name="POLYGON_OFFSET_FACTOR")
double POLYGON_OFFSET_FACTOR();
@JsProperty(name="POLYGON_OFFSET_FILL")
double POLYGON_OFFSET_FILL();
@JsProperty(name="POLYGON_OFFSET_UNITS")
double POLYGON_OFFSET_UNITS();
@JsProperty(name="RED_BITS")
double RED_BITS();
@JsProperty(name="RENDERBUFFER")
double RENDERBUFFER();
@JsProperty(name="RENDERBUFFER_ALPHA_SIZE")
double RENDERBUFFER_ALPHA_SIZE();
@JsProperty(name="RENDERBUFFER_BINDING")
double RENDERBUFFER_BINDING();
@JsProperty(name="RENDERBUFFER_BLUE_SIZE")
double RENDERBUFFER_BLUE_SIZE();
@JsProperty(name="RENDERBUFFER_DEPTH_SIZE")
double RENDERBUFFER_DEPTH_SIZE();
@JsProperty(name="RENDERBUFFER_GREEN_SIZE")
double RENDERBUFFER_GREEN_SIZE();
@JsProperty(name="RENDERBUFFER_HEIGHT")
double RENDERBUFFER_HEIGHT();
@JsProperty(name="RENDERBUFFER_INTERNAL_FORMAT")
double RENDERBUFFER_INTERNAL_FORMAT();
@JsProperty(name="RENDERBUFFER_RED_SIZE")
double RENDERBUFFER_RED_SIZE();
@JsProperty(name="RENDERBUFFER_STENCIL_SIZE")
double RENDERBUFFER_STENCIL_SIZE();
@JsProperty(name="RENDERBUFFER_WIDTH")
double RENDERBUFFER_WIDTH();
@JsProperty(name="RENDERER")
double RENDERER();
@JsProperty(name="REPEAT")
double REPEAT();
@JsProperty(name="REPLACE")
double REPLACE();
@JsProperty(name="RGB")
double RGB();
@JsProperty(name="RGB565")
double RGB565();
@JsProperty(name="RGB5_A1")
double RGB5_A1();
@JsProperty(name="RGBA")
double RGBA();
@JsProperty(name="RGBA4")
double RGBA4();
@JsProperty(name="SAMPLER_2D")
double SAMPLER_2D();
@JsProperty(name="SAMPLER_CUBE")
double SAMPLER_CUBE();
@JsProperty(name="SAMPLES")
double SAMPLES();
@JsProperty(name="SAMPLE_ALPHA_TO_COVERAGE")
double SAMPLE_ALPHA_TO_COVERAGE();
@JsProperty(name="SAMPLE_BUFFERS")
double SAMPLE_BUFFERS();
@JsProperty(name="SAMPLE_COVERAGE")
double SAMPLE_COVERAGE();
@JsProperty(name="SAMPLE_COVERAGE_INVERT")
double SAMPLE_COVERAGE_INVERT();
@JsProperty(name="SAMPLE_COVERAGE_VALUE")
double SAMPLE_COVERAGE_VALUE();
@JsProperty(name="SCISSOR_BOX")
double SCISSOR_BOX();
@JsProperty(name="SCISSOR_TEST")
double SCISSOR_TEST();
@JsProperty(name="SHADER_TYPE")
double SHADER_TYPE();
@JsProperty(name="SHADING_LANGUAGE_VERSION")
double SHADING_LANGUAGE_VERSION();
@JsProperty(name="SHORT")
double SHORT();
@JsProperty(name="SRC_ALPHA")
double SRC_ALPHA();
@JsProperty(name="SRC_ALPHA_SATURATE")
double SRC_ALPHA_SATURATE();
@JsProperty(name="SRC_COLOR")
double SRC_COLOR();
@JsProperty(name="STATIC_DRAW")
double STATIC_DRAW();
@JsProperty(name="STENCIL_ATTACHMENT")
double STENCIL_ATTACHMENT();
@JsProperty(name="STENCIL_BACK_FAIL")
double STENCIL_BACK_FAIL();
@JsProperty(name="STENCIL_BACK_FUNC")
double STENCIL_BACK_FUNC();
@JsProperty(name="STENCIL_BACK_PASS_DEPTH_FAIL")
double STENCIL_BACK_PASS_DEPTH_FAIL();
@JsProperty(name="STENCIL_BACK_PASS_DEPTH_PASS")
double STENCIL_BACK_PASS_DEPTH_PASS();
@JsProperty(name="STENCIL_BACK_REF")
double STENCIL_BACK_REF();
@JsProperty(name="STENCIL_BACK_VALUE_MASK")
double STENCIL_BACK_VALUE_MASK();
@JsProperty(name="STENCIL_BACK_WRITEMASK")
double STENCIL_BACK_WRITEMASK();
@JsProperty(name="STENCIL_BITS")
double STENCIL_BITS();
@JsProperty(name="STENCIL_BUFFER_BIT")
double STENCIL_BUFFER_BIT();
@JsProperty(name="STENCIL_CLEAR_VALUE")
double STENCIL_CLEAR_VALUE();
@JsProperty(name="STENCIL_FAIL")
double STENCIL_FAIL();
@JsProperty(name="STENCIL_FUNC")
double STENCIL_FUNC();
@JsProperty(name="STENCIL_INDEX8")
double STENCIL_INDEX8();
@JsProperty(name="STENCIL_PASS_DEPTH_FAIL")
double STENCIL_PASS_DEPTH_FAIL();
@JsProperty(name="STENCIL_PASS_DEPTH_PASS")
double STENCIL_PASS_DEPTH_PASS();
@JsProperty(name="STENCIL_REF")
double STENCIL_REF();
@JsProperty(name="STENCIL_TEST")
double STENCIL_TEST();
@JsProperty(name="STENCIL_VALUE_MASK")
double STENCIL_VALUE_MASK();
@JsProperty(name="STENCIL_WRITEMASK")
double STENCIL_WRITEMASK();
@JsProperty(name="STREAM_DRAW")
double STREAM_DRAW();
@JsProperty(name="SUBPIXEL_BITS")
double SUBPIXEL_BITS();
@JsProperty(name="TEXTURE")
double TEXTURE();
@JsProperty(name="TEXTURE0")
double TEXTURE0();
@JsProperty(name="TEXTURE1")
double TEXTURE1();
@JsProperty(name="TEXTURE10")
double TEXTURE10();
@JsProperty(name="TEXTURE11")
double TEXTURE11();
@JsProperty(name="TEXTURE12")
double TEXTURE12();
@JsProperty(name="TEXTURE13")
double TEXTURE13();
@JsProperty(name="TEXTURE14")
double TEXTURE14();
@JsProperty(name="TEXTURE15")
double TEXTURE15();
@JsProperty(name="TEXTURE16")
double TEXTURE16();
@JsProperty(name="TEXTURE17")
double TEXTURE17();
@JsProperty(name="TEXTURE18")
double TEXTURE18();
@JsProperty(name="TEXTURE19")
double TEXTURE19();
@JsProperty(name="TEXTURE2")
double TEXTURE2();
@JsProperty(name="TEXTURE20")
double TEXTURE20();
@JsProperty(name="TEXTURE21")
double TEXTURE21();
@JsProperty(name="TEXTURE22")
double TEXTURE22();
@JsProperty(name="TEXTURE23")
double TEXTURE23();
@JsProperty(name="TEXTURE24")
double TEXTURE24();
@JsProperty(name="TEXTURE25")
double TEXTURE25();
@JsProperty(name="TEXTURE26")
double TEXTURE26();
@JsProperty(name="TEXTURE27")
double TEXTURE27();
@JsProperty(name="TEXTURE28")
double TEXTURE28();
@JsProperty(name="TEXTURE29")
double TEXTURE29();
@JsProperty(name="TEXTURE3")
double TEXTURE3();
@JsProperty(name="TEXTURE30")
double TEXTURE30();
@JsProperty(name="TEXTURE31")
double TEXTURE31();
@JsProperty(name="TEXTURE4")
double TEXTURE4();
@JsProperty(name="TEXTURE5")
double TEXTURE5();
@JsProperty(name="TEXTURE6")
double TEXTURE6();
@JsProperty(name="TEXTURE7")
double TEXTURE7();
@JsProperty(name="TEXTURE8")
double TEXTURE8();
@JsProperty(name="TEXTURE9")
double TEXTURE9();
@JsProperty(name="TEXTURE_2D")
double TEXTURE_2D();
@JsProperty(name="TEXTURE_BINDING_2D")
double TEXTURE_BINDING_2D();
@JsProperty(name="TEXTURE_BINDING_CUBE_MAP")
double TEXTURE_BINDING_CUBE_MAP();
@JsProperty(name="TEXTURE_CUBE_MAP")
double TEXTURE_CUBE_MAP();
@JsProperty(name="TEXTURE_CUBE_MAP_NEGATIVE_X")
double TEXTURE_CUBE_MAP_NEGATIVE_X();
@JsProperty(name="TEXTURE_CUBE_MAP_NEGATIVE_Y")
double TEXTURE_CUBE_MAP_NEGATIVE_Y();
@JsProperty(name="TEXTURE_CUBE_MAP_NEGATIVE_Z")
double TEXTURE_CUBE_MAP_NEGATIVE_Z();
@JsProperty(name="TEXTURE_CUBE_MAP_POSITIVE_X")
double TEXTURE_CUBE_MAP_POSITIVE_X();
@JsProperty(name="TEXTURE_CUBE_MAP_POSITIVE_Y")
double TEXTURE_CUBE_MAP_POSITIVE_Y();
@JsProperty(name="TEXTURE_CUBE_MAP_POSITIVE_Z")
double TEXTURE_CUBE_MAP_POSITIVE_Z();
@JsProperty(name="TEXTURE_MAG_FILTER")
double TEXTURE_MAG_FILTER();
@JsProperty(name="TEXTURE_MIN_FILTER")
double TEXTURE_MIN_FILTER();
@JsProperty(name="TEXTURE_WRAP_S")
double TEXTURE_WRAP_S();
@JsProperty(name="TEXTURE_WRAP_T")
double TEXTURE_WRAP_T();
@JsProperty(name="TRIANGLES")
double TRIANGLES();
@JsProperty(name="TRIANGLE_FAN")
double TRIANGLE_FAN();
@JsProperty(name="TRIANGLE_STRIP")
double TRIANGLE_STRIP();
@JsProperty(name="UNPACK_ALIGNMENT")
double UNPACK_ALIGNMENT();
@JsProperty(name="UNPACK_COLORSPACE_CONVERSION_WEBGL")
double UNPACK_COLORSPACE_CONVERSION_WEBGL();
@JsProperty(name="UNPACK_FLIP_Y_WEBGL")
double UNPACK_FLIP_Y_WEBGL();
@JsProperty(name="UNPACK_PREMULTIPLY_ALPHA_WEBGL")
double UNPACK_PREMULTIPLY_ALPHA_WEBGL();
@JsProperty(name="UNSIGNED_BYTE")
double UNSIGNED_BYTE();
@JsProperty(name="UNSIGNED_INT")
double UNSIGNED_INT();
@JsProperty(name="UNSIGNED_SHORT")
double UNSIGNED_SHORT();
@JsProperty(name="UNSIGNED_SHORT_4_4_4_4")
double UNSIGNED_SHORT_4_4_4_4();
@JsProperty(name="UNSIGNED_SHORT_5_5_5_1")
double UNSIGNED_SHORT_5_5_5_1();
@JsProperty(name="UNSIGNED_SHORT_5_6_5")
double UNSIGNED_SHORT_5_6_5();
@JsProperty(name="VALIDATE_STATUS")
double VALIDATE_STATUS();
@JsProperty(name="VENDOR")
double VENDOR();
@JsProperty(name="VERSION")
double VERSION();
@JsProperty(name="VERTEX_ATTRIB_ARRAY_BUFFER_BINDING")
double VERTEX_ATTRIB_ARRAY_BUFFER_BINDING();
@JsProperty(name="VERTEX_ATTRIB_ARRAY_ENABLED")
double VERTEX_ATTRIB_ARRAY_ENABLED();
@JsProperty(name="VERTEX_ATTRIB_ARRAY_NORMALIZED")
double VERTEX_ATTRIB_ARRAY_NORMALIZED();
@JsProperty(name="VERTEX_ATTRIB_ARRAY_POINTER")
double VERTEX_ATTRIB_ARRAY_POINTER();
@JsProperty(name="VERTEX_ATTRIB_ARRAY_SIZE")
double VERTEX_ATTRIB_ARRAY_SIZE();
@JsProperty(name="VERTEX_ATTRIB_ARRAY_STRIDE")
double VERTEX_ATTRIB_ARRAY_STRIDE();
@JsProperty(name="VERTEX_ATTRIB_ARRAY_TYPE")
double VERTEX_ATTRIB_ARRAY_TYPE();
@JsProperty(name="VERTEX_SHADER")
double VERTEX_SHADER();
@JsProperty(name="VIEWPORT")
double VIEWPORT();
@JsProperty(name="ZERO")
double ZERO();
@JsMethod(name="activeTexture")
void activeTexture(double texture);
@JsMethod(name="attachShader")
void attachShader(WebGLProgram program, WebGLShader shader);
@JsMethod(name="bindAttribLocation")
void bindAttribLocation(WebGLProgram program, double index, String name);
@JsMethod(name="bindBuffer")
void bindBuffer(double target, WebGLBuffer buffer);
@JsMethod(name="bindFramebuffer")
void bindFramebuffer(double target, WebGLFramebuffer framebuffer);
@JsMethod(name="bindRenderbuffer")
void bindRenderbuffer(double target, WebGLRenderbuffer renderbuffer);
@JsMethod(name="bindTexture")
void bindTexture(double target, WebGLTexture texture);
@JsMethod(name="blendColor")
void blendColor(double red, double green, double blue, double alpha);
@JsMethod(name="blendEquation")
void blendEquation(double mode);
@JsMethod(name="blendEquationSeparate")
void blendEquationSeparate(double modeRGB, double modeAlpha);
@JsMethod(name="blendFunc")
void blendFunc(double sfactor, double dfactor);
@JsMethod(name="blendFuncSeparate")
void blendFuncSeparate(double srcRGB, double dstRGB, double srcAlpha, double dstAlpha);
@JsMethod(name="bufferData")
void bufferData(double target, double size, double usage);
@JsMethod(name="bufferData")
void bufferData(double target, com.user00.domjnate.api.ArrayBuffer data, double usage);
@JsMethod(name="bufferData")
void bufferData(double target, com.user00.domjnate.api.ArrayBufferView data, double usage);
@JsMethod(name="bufferSubData")
void bufferSubData(double target, double offset, com.user00.domjnate.api.ArrayBuffer data);
@JsMethod(name="bufferSubData")
void bufferSubData(double target, double offset, com.user00.domjnate.api.ArrayBufferView data);
@JsMethod(name="checkFramebufferStatus")
double checkFramebufferStatus(double target);
@JsMethod(name="clear")
void clear(double mask);
@JsMethod(name="clearColor")
void clearColor(double red, double green, double blue, double alpha);
@JsMethod(name="clearDepth")
void clearDepth(double depth);
@JsMethod(name="clearStencil")
void clearStencil(double s);
@JsMethod(name="colorMask")
void colorMask(boolean red, boolean green, boolean blue, boolean alpha);
@JsMethod(name="compileShader")
void compileShader(WebGLShader shader);
@JsMethod(name="compressedTexImage2D")
void compressedTexImage2D(double target, double level, double internalformat, double width, double height, double border, com.user00.domjnate.api.ArrayBufferView data);
@JsMethod(name="compressedTexSubImage2D")
void compressedTexSubImage2D(double target, double level, double xoffset, double yoffset, double width, double height, double format, com.user00.domjnate.api.ArrayBufferView data);
@JsMethod(name="copyTexImage2D")
void copyTexImage2D(double target, double level, double internalformat, double x, double y, double width, double height, double border);
@JsMethod(name="copyTexSubImage2D")
void copyTexSubImage2D(double target, double level, double xoffset, double yoffset, double x, double y, double width, double height);
@JsMethod(name="createBuffer")
WebGLBuffer createBuffer();
@JsMethod(name="createFramebuffer")
WebGLFramebuffer createFramebuffer();
@JsMethod(name="createProgram")
WebGLProgram createProgram();
@JsMethod(name="createRenderbuffer")
WebGLRenderbuffer createRenderbuffer();
@JsMethod(name="createShader")
WebGLShader createShader(double type);
@JsMethod(name="createTexture")
WebGLTexture createTexture();
@JsMethod(name="cullFace")
void cullFace(double mode);
@JsMethod(name="deleteBuffer")
void deleteBuffer(WebGLBuffer buffer);
@JsMethod(name="deleteFramebuffer")
void deleteFramebuffer(WebGLFramebuffer framebuffer);
@JsMethod(name="deleteProgram")
void deleteProgram(WebGLProgram program);
@JsMethod(name="deleteRenderbuffer")
void deleteRenderbuffer(WebGLRenderbuffer renderbuffer);
@JsMethod(name="deleteShader")
void deleteShader(WebGLShader shader);
@JsMethod(name="deleteTexture")
void deleteTexture(WebGLTexture texture);
@JsMethod(name="depthFunc")
void depthFunc(double func);
@JsMethod(name="depthMask")
void depthMask(boolean flag);
@JsMethod(name="depthRange")
void depthRange(double zNear, double zFar);
@JsMethod(name="detachShader")
void detachShader(WebGLProgram program, WebGLShader shader);
@JsMethod(name="disable")
void disable(double cap);
@JsMethod(name="disableVertexAttribArray")
void disableVertexAttribArray(double index);
@JsMethod(name="drawArrays")
void drawArrays(double mode, double first, double count);
@JsMethod(name="drawElements")
void drawElements(double mode, double count, double type, double offset);
@JsMethod(name="enable")
void enable(double cap);
@JsMethod(name="enableVertexAttribArray")
void enableVertexAttribArray(double index);
@JsMethod(name="finish")
void finish();
@JsMethod(name="flush")
void flush();
@JsMethod(name="framebufferRenderbuffer")
void framebufferRenderbuffer(double target, double attachment, double renderbuffertarget, WebGLRenderbuffer renderbuffer);
@JsMethod(name="framebufferTexture2D")
void framebufferTexture2D(double target, double attachment, double textarget, WebGLTexture texture, double level);
@JsMethod(name="frontFace")
void frontFace(double mode);
@JsMethod(name="generateMipmap")
void generateMipmap(double target);
@JsMethod(name="getActiveAttrib")
WebGLActiveInfo getActiveAttrib(WebGLProgram program, double index);
@JsMethod(name="getActiveUniform")
WebGLActiveInfo getActiveUniform(WebGLProgram program, double index);
@JsMethod(name="getAttachedShaders")
com.user00.domjnate.api.Array<WebGLShader> getAttachedShaders(WebGLProgram program);
@JsMethod(name="getAttribLocation")
double getAttribLocation(WebGLProgram program, String name);
@JsMethod(name="getBufferParameter")
java.lang.Object getBufferParameter(double target, double pname);
@JsMethod(name="getContextAttributes")
WebGLContextAttributes getContextAttributes();
@JsMethod(name="getError")
double getError();
@JsMethod(name="getExtension")
java.lang.Object getExtension(String extensionName);
@JsMethod(name="getFramebufferAttachmentParameter")
java.lang.Object getFramebufferAttachmentParameter(double target, double attachment, double pname);
@JsMethod(name="getParameter")
java.lang.Object getParameter(double pname);
@JsMethod(name="getProgramInfoLog")
String getProgramInfoLog(WebGLProgram program);
@JsMethod(name="getProgramParameter")
java.lang.Object getProgramParameter(WebGLProgram program, double pname);
@JsMethod(name="getRenderbufferParameter")
java.lang.Object getRenderbufferParameter(double target, double pname);
@JsMethod(name="getShaderInfoLog")
String getShaderInfoLog(WebGLShader shader);
@JsMethod(name="getShaderParameter")
java.lang.Object getShaderParameter(WebGLShader shader, double pname);
@JsMethod(name="getShaderPrecisionFormat")
WebGLShaderPrecisionFormat getShaderPrecisionFormat(double shadertype, double precisiontype);
@JsMethod(name="getShaderSource")
String getShaderSource(WebGLShader shader);
@JsMethod(name="getSupportedExtensions")
com.user00.domjnate.api.Array<String> getSupportedExtensions();
@JsMethod(name="getTexParameter")
java.lang.Object getTexParameter(double target, double pname);
@JsMethod(name="getUniform")
java.lang.Object getUniform(WebGLProgram program, WebGLUniformLocation location);
@JsMethod(name="getUniformLocation")
WebGLUniformLocation getUniformLocation(WebGLProgram program, String name);
@JsMethod(name="getVertexAttrib")
java.lang.Object getVertexAttrib(double index, double pname);
@JsMethod(name="getVertexAttribOffset")
double getVertexAttribOffset(double index, double pname);
@JsMethod(name="hint")
void hint(double target, double mode);
@JsMethod(name="isBuffer")
boolean isBuffer(WebGLBuffer buffer);
@JsMethod(name="isContextLost")
boolean isContextLost();
@JsMethod(name="isEnabled")
boolean isEnabled(double cap);
@JsMethod(name="isFramebuffer")
boolean isFramebuffer(WebGLFramebuffer framebuffer);
@JsMethod(name="isProgram")
boolean isProgram(WebGLProgram program);
@JsMethod(name="isRenderbuffer")
boolean isRenderbuffer(WebGLRenderbuffer renderbuffer);
@JsMethod(name="isShader")
boolean isShader(WebGLShader shader);
@JsMethod(name="isTexture")
boolean isTexture(WebGLTexture texture);
@JsMethod(name="lineWidth")
void lineWidth(double width);
@JsMethod(name="linkProgram")
void linkProgram(WebGLProgram program);
@JsMethod(name="pixelStorei")
void pixelStorei(double pname, double param);
@JsMethod(name="polygonOffset")
void polygonOffset(double factor, double units);
@JsMethod(name="readPixels")
void readPixels(double x, double y, double width, double height, double format, double type, com.user00.domjnate.api.ArrayBufferView pixels);
@JsMethod(name="renderbufferStorage")
void renderbufferStorage(double target, double internalformat, double width, double height);
@JsMethod(name="sampleCoverage")
void sampleCoverage(double value, boolean invert);
@JsMethod(name="scissor")
void scissor(double x, double y, double width, double height);
@JsMethod(name="shaderSource")
void shaderSource(WebGLShader shader, String source);
@JsMethod(name="stencilFunc")
void stencilFunc(double func, double ref, double mask);
@JsMethod(name="stencilFuncSeparate")
void stencilFuncSeparate(double face, double func, double ref, double mask);
@JsMethod(name="stencilMask")
void stencilMask(double mask);
@JsMethod(name="stencilMaskSeparate")
void stencilMaskSeparate(double face, double mask);
@JsMethod(name="stencilOp")
void stencilOp(double fail, double zfail, double zpass);
@JsMethod(name="stencilOpSeparate")
void stencilOpSeparate(double face, double fail, double zfail, double zpass);
@JsMethod(name="texImage2D")
void texImage2D(double target, double level, double internalformat, double width, double height, double border, double format, double type, com.user00.domjnate.api.ArrayBufferView pixels);
@JsMethod(name="texImage2D")
void texImage2D(double target, double level, double internalformat, double format, double type, com.user00.domjnate.api.html.HTMLVideoElement source);
@JsMethod(name="texImage2D")
void texImage2D(double target, double level, double internalformat, double format, double type, com.user00.domjnate.api.html.HTMLCanvasElement source);
@JsMethod(name="texImage2D")
void texImage2D(double target, double level, double internalformat, double format, double type, com.user00.domjnate.api.html.HTMLImageElement source);
@JsMethod(name="texImage2D")
void texImage2D(double target, double level, double internalformat, double format, double type, com.user00.domjnate.api.ImageData source);
@JsMethod(name="texImage2D")
void texImage2D(double target, double level, double internalformat, double format, double type, com.user00.domjnate.api.ImageBitmap source);
@JsMethod(name="texParameterf")
void texParameterf(double target, double pname, double param);
@JsMethod(name="texParameteri")
void texParameteri(double target, double pname, double param);
@JsMethod(name="texSubImage2D")
void texSubImage2D(double target, double level, double xoffset, double yoffset, double width, double height, double format, double type, com.user00.domjnate.api.ArrayBufferView pixels);
@JsMethod(name="texSubImage2D")
void texSubImage2D(double target, double level, double xoffset, double yoffset, double format, double type, com.user00.domjnate.api.html.HTMLVideoElement source);
@JsMethod(name="texSubImage2D")
void texSubImage2D(double target, double level, double xoffset, double yoffset, double format, double type, com.user00.domjnate.api.html.HTMLCanvasElement source);
@JsMethod(name="texSubImage2D")
void texSubImage2D(double target, double level, double xoffset, double yoffset, double format, double type, com.user00.domjnate.api.html.HTMLImageElement source);
@JsMethod(name="texSubImage2D")
void texSubImage2D(double target, double level, double xoffset, double yoffset, double format, double type, com.user00.domjnate.api.ImageData source);
@JsMethod(name="texSubImage2D")
void texSubImage2D(double target, double level, double xoffset, double yoffset, double format, double type, com.user00.domjnate.api.ImageBitmap source);
@JsMethod(name="uniform1f")
void uniform1f(WebGLUniformLocation location, double x);
@JsMethod(name="uniform1fv")
void uniform1fv(WebGLUniformLocation location, com.user00.domjnate.api.Array<Double> v);
@JsMethod(name="uniform1fv")
void uniform1fv(WebGLUniformLocation location, com.user00.domjnate.api.Float32Array v);
@JsMethod(name="uniform1i")
void uniform1i(WebGLUniformLocation location, double x);
@JsMethod(name="uniform1iv")
void uniform1iv(WebGLUniformLocation location, com.user00.domjnate.api.Array<Double> v);
@JsMethod(name="uniform1iv")
void uniform1iv(WebGLUniformLocation location, com.user00.domjnate.api.Int32Array v);
@JsMethod(name="uniform2f")
void uniform2f(WebGLUniformLocation location, double x, double y);
@JsMethod(name="uniform2fv")
void uniform2fv(WebGLUniformLocation location, com.user00.domjnate.api.Array<Double> v);
@JsMethod(name="uniform2fv")
void uniform2fv(WebGLUniformLocation location, com.user00.domjnate.api.Float32Array v);
@JsMethod(name="uniform2i")
void uniform2i(WebGLUniformLocation location, double x, double y);
@JsMethod(name="uniform2iv")
void uniform2iv(WebGLUniformLocation location, com.user00.domjnate.api.Array<Double> v);
@JsMethod(name="uniform2iv")
void uniform2iv(WebGLUniformLocation location, com.user00.domjnate.api.Int32Array v);
@JsMethod(name="uniform3f")
void uniform3f(WebGLUniformLocation location, double x, double y, double z);
@JsMethod(name="uniform3fv")
void uniform3fv(WebGLUniformLocation location, com.user00.domjnate.api.Array<Double> v);
@JsMethod(name="uniform3fv")
void uniform3fv(WebGLUniformLocation location, com.user00.domjnate.api.Float32Array v);
@JsMethod(name="uniform3i")
void uniform3i(WebGLUniformLocation location, double x, double y, double z);
@JsMethod(name="uniform3iv")
void uniform3iv(WebGLUniformLocation location, com.user00.domjnate.api.Array<Double> v);
@JsMethod(name="uniform3iv")
void uniform3iv(WebGLUniformLocation location, com.user00.domjnate.api.Int32Array v);
@JsMethod(name="uniform4f")
void uniform4f(WebGLUniformLocation location, double x, double y, double z, double w);
@JsMethod(name="uniform4fv")
void uniform4fv(WebGLUniformLocation location, com.user00.domjnate.api.Array<Double> v);
@JsMethod(name="uniform4fv")
void uniform4fv(WebGLUniformLocation location, com.user00.domjnate.api.Float32Array v);
@JsMethod(name="uniform4i")
void uniform4i(WebGLUniformLocation location, double x, double y, double z, double w);
@JsMethod(name="uniform4iv")
void uniform4iv(WebGLUniformLocation location, com.user00.domjnate.api.Array<Double> v);
@JsMethod(name="uniform4iv")
void uniform4iv(WebGLUniformLocation location, com.user00.domjnate.api.Int32Array v);
@JsMethod(name="uniformMatrix2fv")
void uniformMatrix2fv(WebGLUniformLocation location, boolean transpose, com.user00.domjnate.api.Array<Double> value);
@JsMethod(name="uniformMatrix2fv")
void uniformMatrix2fv(WebGLUniformLocation location, boolean transpose, com.user00.domjnate.api.Float32Array value);
@JsMethod(name="uniformMatrix3fv")
void uniformMatrix3fv(WebGLUniformLocation location, boolean transpose, com.user00.domjnate.api.Array<Double> value);
@JsMethod(name="uniformMatrix3fv")
void uniformMatrix3fv(WebGLUniformLocation location, boolean transpose, com.user00.domjnate.api.Float32Array value);
@JsMethod(name="uniformMatrix4fv")
void uniformMatrix4fv(WebGLUniformLocation location, boolean transpose, com.user00.domjnate.api.Array<Double> value);
@JsMethod(name="uniformMatrix4fv")
void uniformMatrix4fv(WebGLUniformLocation location, boolean transpose, com.user00.domjnate.api.Float32Array value);
@JsMethod(name="useProgram")
void useProgram(WebGLProgram program);
@JsMethod(name="validateProgram")
void validateProgram(WebGLProgram program);
@JsMethod(name="vertexAttrib1f")
void vertexAttrib1f(double index, double x);
@JsMethod(name="vertexAttrib1fv")
void vertexAttrib1fv(double index, com.user00.domjnate.api.Array<Double> values);
@JsMethod(name="vertexAttrib1fv")
void vertexAttrib1fv(double index, com.user00.domjnate.api.Float32Array values);
@JsMethod(name="vertexAttrib2f")
void vertexAttrib2f(double index, double x, double y);
@JsMethod(name="vertexAttrib2fv")
void vertexAttrib2fv(double index, com.user00.domjnate.api.Array<Double> values);
@JsMethod(name="vertexAttrib2fv")
void vertexAttrib2fv(double index, com.user00.domjnate.api.Float32Array values);
@JsMethod(name="vertexAttrib3f")
void vertexAttrib3f(double index, double x, double y, double z);
@JsMethod(name="vertexAttrib3fv")
void vertexAttrib3fv(double index, com.user00.domjnate.api.Array<Double> values);
@JsMethod(name="vertexAttrib3fv")
void vertexAttrib3fv(double index, com.user00.domjnate.api.Float32Array values);
@JsMethod(name="vertexAttrib4f")
void vertexAttrib4f(double index, double x, double y, double z, double w);
@JsMethod(name="vertexAttrib4fv")
void vertexAttrib4fv(double index, com.user00.domjnate.api.Array<Double> values);
@JsMethod(name="vertexAttrib4fv")
void vertexAttrib4fv(double index, com.user00.domjnate.api.Float32Array values);
@JsMethod(name="vertexAttribPointer")
void vertexAttribPointer(double index, double size, double type, boolean normalized, double stride, double offset);
@JsMethod(name="viewport")
void viewport(double x, double y, double width, double height);
}
